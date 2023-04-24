package com.example.coach.modele;

import junit.framework.TestCase;

public class ProfileUserTest extends TestCase {

    /**
     *  Creation du profile
     */
    private ProfileUser profil = new ProfileUser(60,150,30,1);

    /**
     *  Calcule de IMG
     */
    private float img = (float) 22.67;

    private String mention = "normal";
    public void testGetImg() {
        assertEquals(img, profil.getImg(), (float) 0.1);
    }

    public void testGetMention() {
        assertEquals(mention, profil.getMention());
    }
}