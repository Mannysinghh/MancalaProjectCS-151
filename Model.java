/*
 *defines a model object
 */
import java.util.ArrayList;

public class Model{

	public String myString;	// strings are added to the model
	public ArrayList<String> model;	// the model data structure
	
	/*
	 * creates a model object
	 */
	public Model()
	{
		model = new ArrayList<String>();
	}
	
	/*
	 * adds the given string to the model
	 */
	public void addToModel(String s)
	{
		model.add(s);
	}
	
	/*
	 * get the side of the model
	 * @return the size of the model
	 */
	public int getSizeOfModel()
	{
		return model.size();
	}
	
	/*
	 * get index k from the model 
	 * @param k the index to get
	 * @return the string at index k
	 */
	public String get(int k)
	{
		return model.get(k);
	}
}