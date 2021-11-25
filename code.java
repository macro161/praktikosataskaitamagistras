if(duomenys sėkmingai nuskaityti iš Vertex DB){
    if(duomenys sėkmingai nuskaityti iš Auth0 DB) { 
        if(duomenys sėkmingai pakeisti Auth0 DB) {
            if(duomenys sėkmingai pakeisti Vertex DB) {
                baigti darbą;
            } else {
                Parodyti klaidos pranešimą;
                Bandyti atstatyti duomenis Vertex DB;
                Bandyti atstatyti duomenis Auth0 DB;
                Nepavykus atstatyti pranešti DB administratoriui;
            }
        } else {
            Parodyti klaidos pranešimą;
            Bandyti atstatyti duomenis Auth0 DB.
            Nepavykus atstatyti pranešti DB administratoriui.
        }
    } else {
        Parodyti klaidos pranešimą;
    }
} else {
    Parodyti klaidos pranešimą;
}