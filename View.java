import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class View implements ChangeListener
{
	/*
	 * View object for Moncala Tester
	 */

		private int NUM_PITS = 6;
		
		public View(BoardStyle b)
		{
			MancalaBoard game = new MancalaBoard(b);
		}

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			//gets models array
			//repaints pits
			
		}
		
	}

