public class Main {

    public static void main(String[] args) {
        Agenda agendaPersonal = new Agenda();
        System.out.println("---------AGREGANDO CONTACTOS Y EVENTOS------------");
        agendaPersonal.agregarContacto(new ContactoT1(1 ,"Julieth", 19, true, "Detras del mercado", "8603-6787","juliethcp22@gmail.com" ));
        agendaPersonal.agregarContacto(new ContactoT1(2 ,"Juan", 20, false, "Detras del super", "8822-8887","elcorreo@correo.com" ));
        agendaPersonal.agregarContacto(new ContactoT2(1, "Luis", 30, false, "Detras del cementerio","5858-8585","Luis DB","66348342"));
        
        agendaPersonal.agregarEvento(new EventoT1 ("Cita proyecto","Santa Clara", "21/10/2022", "Explicar proyecto","Lenguajes de programacion"));
        agendaPersonal.agregarEvento(new EventoT2("Benefico","Buenos Aires", "22/10/2022", 20,"Arroz con pollo"));
        System.out.println("***IMPRIMIENDO CONTACTOS Y EVENTOS***");
        agendaPersonal.imprimirContactos();
    }
    
}