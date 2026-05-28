public class PruebaMensaje {
    
    public static void main(String[] args) {
        
        Mensajero mensaje1 = new Mensajero();
        mensaje1.enviarMail("Hola, ¿como estás? Este es mi correo es sharoll@mail");

        System.out.println(" ");

        CanalMensaje sms = new MensajeSMS();
        sms.enviar("SMS: Te quedaste sin minutos? Disfruta hoy y recargas mañana");

        System.out.println(" ");

        CanalMensaje push = new MensajePush();
        push.enviar("Notificacion: @Tae le dio like a tu post");
    }
}
