package sneps.snip.rules;

import sneps.network.RuleNode;
import sneps.network.classes.Semantic;
import sneps.network.classes.term.Term;
import sneps.setClasses.NodeSet;
import sneps.snip.classes.RuleUseInfo;

public class WhenDoNode extends RuleNode {

	public WhenDoNode() {}

	public WhenDoNode(Semantic sem, Term syn) {
		super(sem, syn);
	}

	public WhenDoNode(Term syn) {
		super(syn);
	}


	@Override
	protected void sendRui(RuleUseInfo tRui, String contextID) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public NodeSet getDownAntNodeSet() {
		// TODO Auto-generated method stub
		return null;
	}

}
