
public class WizardAdapter implements Warrior{
	private Wizard wizard;
	
	public WizardAdapter(Wizard w) {
		this.wizard = w;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		wizard.performSpell();
	}

	@Override
	public void defend() {
		// TODO Auto-generated method stub
		wizard.Heal();
	}

}
