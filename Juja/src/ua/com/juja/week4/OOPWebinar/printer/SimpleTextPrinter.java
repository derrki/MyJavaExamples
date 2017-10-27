package ua.com.juja.week4.OOPWebinar.printer;

import ua.com.juja.week4.OOPWebinar.apartment.LivingApartment;

/**
*1.Make it work. 2.Make it right. 3.Make it fastpublic
*/

public class SimpleTextPrinter implements Printer{

    @Override
    public String print(LivingApartment livingApartment) {
        String result = super.toString();
        String[] owners = livingApartment.getOwners();
        for (int index = 0; index < owners.length ; index++) {
            String owner = owners[index];
            if (owner != null){
                result += "*****************************\n";
                result += "Owner :" + owner.toString() + "\n";
                result += "*****************************\n";
            }
        }
        return result;
    }

}
