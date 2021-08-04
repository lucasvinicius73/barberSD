public class main {
    public static void main(String[] args) {
        String host = (args.length < 1) ? null : args[0];
        try {
            
            // ObtÃ©m uma referÃªncia para o registro do RMI
            Registry registry = LocateRegistry.getRegistry(host);
            // ObtÃ©m a stub do servidor
            //CounterServer stub =  (CounterServer) registry.lookup("Counter");
            iBarber stub = (iBarber) registry.lookup("Barber");

            stub.cortarBarba(id);

          
      
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
