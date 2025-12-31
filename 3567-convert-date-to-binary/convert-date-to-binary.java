class Solution {
    int year, month, day;

    public void convertStringDateToIntVariables(String date) {
        year = Integer.valueOf(date.substring(0, 4));
        month = Integer.valueOf(date.substring(5, 7));
        day = Integer.valueOf(date.substring(8, 10));
    }

    public String convertDateToBinary(String date) {
        convertStringDateToIntVariables(date);
        String sbr = new String(
                Integer.toBinaryString(year) + "-" + Integer.toBinaryString(month) + "-" + Integer.toBinaryString(day));
        return sbr;
    }
}

//amar sunil sakhre