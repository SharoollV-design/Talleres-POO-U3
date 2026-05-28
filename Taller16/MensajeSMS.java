public class MensajeSMS implements CanalMensaje{

    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
