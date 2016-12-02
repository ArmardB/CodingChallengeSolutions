package com.armardbellamy.main;



    public class NumberToWords {

        public static void main(String[] args) {
            System.out.println(convertNumbersToWords(555) + "Dollars");
        }

        private static final String[] BASE_TEN = {
                "", "Ten ", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
                "Seventy", "Eighty", "Ninety"};

        private static final String[] LESS_THAN_TWENTY = {
                "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
                "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};



        private static String convertHundreds(int number, String item) {
            //this method breaks triple digits into words and adds the name of denomination
            if (number == 0) {
                return "";
            }
            String result;

            if (number % 100 < 20) {
                result = LESS_THAN_TWENTY[number % 100];
                number /= 100;
            } else {
                result = LESS_THAN_TWENTY[number % 10];
                number /= 10;

                result = BASE_TEN[number % 10] + result;
                number /= 10;
            }
            if (number == 0) {
                return result + item;
            }

            return LESS_THAN_TWENTY[number] + "Hundred" + result + item;
        }

        private static int findPlaceValue(long number, long level) {
            //This method is supposed to get separate numerical values of a number like thousands, millions, etc.
            return (int) ((number / level) % 1000);
        }

        public static String convertNumbersToWords(long number) {
            if (number == 0) {
                return "Zero";
            }

            int thousands = findPlaceValue(number, 1);
            int hundredThousands = findPlaceValue(number, 1000);
            int millions = findPlaceValue(number, 1000000);
            int billions = findPlaceValue(number, 1000000000L);

            String result = "";
            result += convertHundreds(billions, "Billion");
            result += convertHundreds(millions, "Million");
            result += convertHundreds(hundredThousands, "Thousand");
            result += convertHundreds(thousands, "");

            return result.trim();
        }
    }



