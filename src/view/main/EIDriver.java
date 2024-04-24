package view.main;

import model.facade.*;

import view.components.*;

import java.util.Properties;

import javax.swing.SwingUtilities;

public class EIDriver {
	
	private static EIModel model;
	private MainFrame mainFrame;
	
	public EIDriver() {
		mainFrame = new MainFrame(model);
		mainFrame.setVisible(true); 

	}
	
	public static void main(String[] args) {
		
		model = new EIFacade();
		
		System.out.println("Welcome to the Earthquake Insight Application");
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				/* Changes for Mac OSX */
				/* Also need to add the OSX jfxrt.jar */
				Properties props = System.getProperties();
				props.put("prism.order", "sw");
				
				/* Isntantiate the driver */
				new EIDriver();
				
				String apiKey = "#################";

				if (args.length > 1) {
					System.out.println("This proegram only takes one argument, a Google Maps API Key, in the form of apikey=YOUR_API_KEY");
					return;
				}
				if (args.length == 0) {
					System.out.println("This program requires a Google Maps API Key to run. Please provide one in the format apikey=YOUR_API_KEY");
					return;
				}
				for (String arg : args) {
					if (arg.contains("apikey=")) {	
						apiKey = arg.substring(7);
					} else {
						System.out.println("This program only takes one argument, a Google Maps API Key, in the form of apikey=YOUR_API_KEY");
						return;
					}
				}
				
				model.setAPIKeyGSM(apiKey);
			}
		});
	}

}
