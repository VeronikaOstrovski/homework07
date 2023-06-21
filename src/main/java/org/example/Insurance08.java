package org.example;

public class Insurance08 {

    public int insurance100(int a) {
        int age100 = a;
        int coast100;
        if (age100 >= 30 && age100 <= 65) {
            return coast100 = 100;
        }
        if (age100 < 30 && age100 > 65) ;
        {
            return coast100 = 0;
        }
    }

    public int insurance120(int a) {
        int age120 = a;
        int coast120;
        if (age120 >= 18 && age120 <= 29) {
            return coast120 = 120;
        }
        if (age120 < 18 && age120 > 29) ;
        {
            return coast120 = 0;
        }
    }
        public int insurance130(int a) {
            int age130 = a;
            int coast130;
            if (age130 >= 66 && age130 <= 79) {
                return coast130 = 130;
            }
            if (age130 < 66 && age130 > 79) ;
            {
                return coast130 = 0;
            }
    }

    public int insurance0(int a) {
        int age100 = a;
        int age120 = a;
        int age130 = a;
        int coast0;
        if (age100 < 30 && age100 > 65) {
            return coast0 = 0;
        }
        if (age120 < 18 && age120 > 29) {
            return coast0 = 0;
        }
        if (age130 < 66 && age130 > 79); {
            return coast0 = 0;
        }
    }
}