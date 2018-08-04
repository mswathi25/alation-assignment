package context;

import model.Model;

public class context {
	private static Model model;
	public static Model getModel() throws Exception  {
		if (context.model == null) {
			context.model = new Model();
		}

		return context.model;
	}
}
