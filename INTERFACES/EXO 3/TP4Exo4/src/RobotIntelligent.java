
public class RobotIntelligent implements Intelligent {
	@Override
    public void seDeplacer() {
        System.out.println("Le robot se déplace vers la destination.");
    }

    @Override
    public void recharger() {
        System.out.println("Le robot est en train de se recharger.");
    }

    @Override
    public void analyser() {
        System.out.println("Le robot analyse les données environnantes.");
    }

}
