public enum Day {
    PAZARTESI(1),
    SALI(2),
    CARSAMBA(3),
    PERSEMBE(4),
    CUMA(5),
    CUMARTESI(6),
    PAZAR(7);
    private int day;

    Day(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void getDayName() {
        String dayName = null;
        switch (this.day) {
            case 1:
                dayName = "Pazartesi";
                break;
            case 2:
                dayName = "Salı";
                break;
            case 3:
                dayName = "Çarşamba";
                break;
            case 4:
                dayName = "Perşembe";
                break;
            case 5:
                dayName = "Cuma";
                break;
            case 6:
                dayName = "Cumartesi";
                break;
            case 7:
                dayName = "Pazar";
                break;

        }
        System.out.print(dayName);
    }
}
