package gr.aueb.cf.mobilecontacts.validation;

import gr.aueb.cf.mobilecontacts.dto.MobileContactInsertDTO;
import gr.aueb.cf.mobilecontacts.dto.MobileContactUpdateDTO;

public class ValidationUtil {

    private ValidationUtil() {

    }

    public static String validateDTO(MobileContactInsertDTO insertDTO) {
        String errorResponse = "";
        if  (insertDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Το Τηλ πρεπει να εχει περισσοτερους απο 5 συμβολα.\n";
        if  (insertDTO.getFirstname().length() < 2)
            errorResponse += "Το ονομα πρεπει να εχει τουλαχιστον 2 ψαρακτηρες.\n";
        if  (insertDTO.getLastname().length() < 2)
            errorResponse += "Το επωνυμο πρεπει να εχει τουλαχιστον 2 ψαρακτηρες.\n";

        return errorResponse;
    }

    public static String validateDTO(MobileContactUpdateDTO updateDTO) {
        String errorResponse = "";
        if  (updateDTO.getPhoneNumber().length() <= 5)
            errorResponse += "Το Τηλ πρεπει να εχει περισσοτερους απο 5 συμβολα.\n";
        if  (updateDTO.getFirstname().length() < 2)
            errorResponse += "Το ονομα πρεπει να εχει τουλαχιστον 2 ψαρακτηρες.\n";
        if  (updateDTO.getLastname().length() < 2)
            errorResponse += "Το επωνυμο πρεπει να εχει τουλαχιστον 2 ψαρακτηρες.\n";

        return errorResponse;
    }
}
