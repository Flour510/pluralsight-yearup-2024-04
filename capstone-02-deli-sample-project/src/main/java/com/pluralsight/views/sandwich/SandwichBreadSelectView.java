package com.pluralsight.views.sandwich;

import com.pluralsight.models.data.ProductType;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class SandwichBreadSelectView extends ViewBase
{
    private List<ProductType> breads;

    public SandwichBreadSelectView(List<ProductType> breads)
    {
        this.breads = breads;
    }

    public ProductType getBreadSelection()
    {
        printLine();
        printHeader("Select Sandwich Bread");

        printLine();
        breads.forEach(bread -> {
            printOptionLine(bread.getId(), bread.getName());
        });
        printCancelLine();
        printLine();

        while(true)
        {
            try
            {
                printYellow("Please select and option: ");
                int option = getIntInput();

                // cancel
                if(option == 0) return null;

                var selection = breads.stream().filter(b -> b.getId() == option).findFirst();
                if(selection.isPresent())
                {
                    return selection.get();
                }
                printLine();
                printRedLine("The option you selected is invalid.");
            }
            catch (Exception e)
            {
            }
        }
    }
}
