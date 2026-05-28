public class MensajePush implements CanalMensaje {

    public void enviar(String mensaje){
        System.out.println("Enviando notificacion push: " + mensaje);
    }
}
