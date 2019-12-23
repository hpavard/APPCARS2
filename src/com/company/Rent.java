/**
 * In this part, we can manage the rentings
 * of the cars and their returns
 * by the users of the application.
 */

package com.company;

public class Rent {

    /**
     * Rent informations :
     */
    private String userLastName;
    private String userFirstName;
    private String carReference;
    private int dateOfRent;
    private int dateOfRendering;

    public Rent(String ul, String uf, String cr, int drt, int drd) {
        userLastName = ul;
        userFirstName = uf;
        carReference = cr;
        dateOfRent = drt;
        dateOfRendering = drd;

        if (drd <= drt) {
            drd = drt + 1;

            /**
             * The application will be usable in 2020.
             * Here is the year 2020 calendar settings for rentings,
             * the date format is YYYYMMDD.
             */
            /**
             * JAN. 2020
             */
            if (drt < 20200101) {
                drt = 20200101;
            }
            if (20200131 < drt && drt < 20200200) {
                drt = 20200131;
            }
            /**
             * FEB. 2020
             */
            if (drt == 20200200) {
                drt = 20200201;
            }
            if (20200229 < drt && drt < 20200300) {
                drt = 20200229;
            }
            /**
             * MAR. 2020
             */
            if (drt == 20200300) {
                drt = 20200301;
            }
            if (20200331 < drt && drt < 20200400) {
                drt = 20200331;
            }
            /**
             * APR. 2020
             */
            if (drt == 20200400) {
                drt = 20200401;
            }
            if (20200430 < drt && drt < 20200500) {
                drt = 20200430;
            }
            /**
             * MAY. 2020
             */
            if (drt == 20200500) {
                drt = 20200501;
            }
            if (20200531 < drt && drt < 20200600) {
                drt = 20200531;
            }
            /**
             * JUN. 2020
             */
            if (drt == 20200600) {
                drt = 20200601;
            }
            if (20200630 < drt && drt < 20200700) {
                drt = 20200630;
            }
            /**
             * JUL. 2020
             */
            if (drt == 20200700) {
                drt = 20200701;
            }
            if (20200731 < drt && drt < 20200800) {
                drt = 20200731;
            }
            /**
             * AUG. 2020
             */
            if (drt == 20200800) {
                drt = 20200801;
            }
            if (20200831 < drt && drt < 20200900) {
                drt = 20200229;
            }
            /**
             * SEP. 2020
             */
            if (drt == 20200900) {
                drt = 20200901;
            }
            if (20200930 < drt && drt < 20201000) {
                drt = 20200930;
            }
            /**
             * OCT. 2020
             */
            if (drt == 20201000) {
                drt = 20201001;
            }
            if (20201031 < drt && drt < 20201100) {
                drt = 20201031;
            }
            /**
             * NOV. 2020
             */
            if (drt == 20201100) {
                drt = 20201101;
            }
            if (20201130 < drt && drt < 20201200) {
                drt = 20201130;
            }
            /**
             * DEC. 2020
             */
            if (drt == 20201200) {
                drt = 20201201;
            }
            if (20201231 < drt && drt < 20201300) {
                drt = 20201231;
            }

            /**
             * Year 2020 calendar settings for returns :
             */
            /**
             * JAN. 2020
             */
            if (drd < 20200101) {
                drd = 20200101;
            }
            if (20200131 < drd && drd < 20200200) {
                drd = 20200131;
            }
            /**
             * FEB. 2020
             */
            if (drd == 20200200) {
                drd = 20200201;
            }
            if (20200229 < drd && drd < 20200300) {
                drd = 20200229;
            }
            /**
             * MAR. 2020
             */
            if (drd == 20200300) {
                drd = 20200301;
            }
            if (20200331 < drd && drd < 20200400) {
                drd = 20200331;
            }
            /**
             * APR. 2020
             */
            if (drd == 20200400) {
                drd = 20200401;
            }
            if (20200430 < drd && drd < 20200500) {
                drd = 20200430;
            }
            /**
             * MAY. 2020
             */
            if (drd == 20200500) {
                drd = 20200501;
            }
            if (20200531 < drd && drd < 20200600) {
                drd = 20200531;
            }
            /**
             * JUN. 2020
             */
            if (drd == 20200600) {
                drd = 20200601;
            }
            if (20200630 < drd && drd < 20200700) {
                drd = 20200630;
            }
            /**
             * JUL. 2020
             */
            if (drd == 20200700) {
                drd = 20200701;
            }
            if (20200731 < drd && drd < 20200800) {
                drd = 20200731;
            }
            /**
             * AUG. 2020
             */
            if (drd == 20200800) {
                drd = 20200801;
            }
            if (20200831 < drd && drd < 20200900) {
                drd = 20200229;
            }
            /**
             * SEP. 2020
             */
            if (drd == 20200900) {
                drd = 20200901;
            }
            if (20200930 < drd && drd < 20201000) {
                drd = 20200930;
            }
            /**
             * OCT. 2020
             */
            if (drd == 20201000) {
                drd = 20201001;
            }
            if (20201031 < drd && drd < 20201100) {
                drd = 20201031;
            }
            /**
             * NOV. 2020
             */
            if (drd == 20201100) {
                drd = 20201101;
            }
            if (20201130 < drd && drd < 20201200) {
                drd = 20201130;
            }
            /**
             * DEC. 2020
             */
            if (drd == 20201200) {
                drd = 20201201;
            }
            if (20201231 < drd && drd < 20201300) {
                drd = 20201231;
            }
        }
    }

    /**
     * Get car informations :
     */
    public String getUserLastName() {
        return userLastName;
    }
    public String getUserFirstName() {
        return userFirstName;
    }
    public String getCarReference() {
        return carReference;
    }
    public int getDateOfRent() {
        return dateOfRent;
    }
    public int getDateOfRendering() {
        return dateOfRendering;
    }

    /**
     * New renting :
     */
    public void setUserLastName(String ul) {
        userLastName = ul;
    }
    public void setUserFirstName(String uf) {
        userFirstName = uf;
    }
    public void setCarReference(String cr) {
        carReference = cr;
    }
    public void setDateOfRent(int drt) {
        dateOfRent = drt;
    }
    public void setDateOfRendering(int drd) {
        dateOfRendering = drd;
    }

}
