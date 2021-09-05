/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
public class ServerWithFacade {
    public static void main(String[] args) {
        FacadeServer Server = new FacadeServer();
	Server.startServer();
	Server.stopServer();
    }
    
}
