package rmiClient;
import metier.Compte;
import rmiService.IBanque;

import javax.naming.Context;
import javax.naming.InitialContext;

public class BanqueClient {


        public static void main(String[] args) {

            try {

                Context ctx =
                        new InitialContext();

                IBanque stub =
                        (IBanque) ctx.lookup("BK");

                Compte c =
                        new Compte(10, 5000);

                System.out.println(
                        stub.creerCompte(c)
                );

                System.out.println(
                        stub.getInfoCompte(10)
                );

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

