class Saturday {
    public static void main(String args[]) {
        int number = 12;
        String Furniture;
        if (number == 7 || number == 1 || number == 2)
        {
            Furniture = "Кровать";
        }
        else if (number ==3 || number == 4 || number == 5)
        {
            Furniture = "Диван";
        }
        else if (number == 6 || number == 12 || number == 8)
        {
            Furniture = "Стул";
        }
        else if (number == 9 || number == 10 || number == 11)
        {
            Furniture = "Стол";
        }
        else
        {
            Furniture = "Bogus Fur";
        }
        System.out.println( "Остап Бендер искал " + Furniture + "№ 12");
    }
}
