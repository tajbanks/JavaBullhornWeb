/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customTools;

/**
 *
 * @author allureanderson
 */ 

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
   
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JavaBullHornWebPU");
    public static EntityManagerFactory getEmFactory() {
        return emf;
    }
}

