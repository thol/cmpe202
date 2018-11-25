
public privileged aspect Cost25 {
	// TODO Auto-generated aspect
	// Initialize Cost of Gumball 
	after() returning(GumballMachine m) : call(GumballMachine.new(..)) {
		m.setCost(25) ;
	}
}