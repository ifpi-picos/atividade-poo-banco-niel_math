package br.edu.ifpi.dominio;

public class Email implements Notification {

    @Override
    public String toString() {
        return "Email";
    }

    @Override
    public void sendNotificaton(String operacao, double valor) {
    }
}
