import Includes.*;

public class AuthList{

	public static final String start_string = "2018CS50402";
	public Node firstNode;
	public Node lastNode;

	public AuthList(){
		/*
			Implement Code here
		*/
	}

	/*
		Note that the Exceptions have already been defined for you in the includes file,
		you just have to raise them accordingly

	*/


	public static boolean CheckList(AuthList current, String proof) throws AuthenticationFailedException {
		


		return true;
	}


	public String InsertNode(Data datainsert, String proof) throws AuthenticationFailedException {
		/*
			Implement Code here
		*/

		return null;
	}

	public String DeleteFirst(String proof) throws AuthenticationFailedException, EmptyListException {
		/*
			Implement Code here
		*/

		return null;
	}


	public String DeleteLast(String proof) throws AuthenticationFailedException, EmptyListException {
		/*
			Implement Code here
		*/

		return null;
	}


	public static Node RetrieveNode(AuthList current, String proof, Data data) throws AuthenticationFailedException, DocumentNotFoundException{
		/*
			Implement Code here
		*/
		return null;
	}

	public void AttackList(AuthList current, String new_data)throws EmptyListException{
		/*
			Implement Code here
		*/
	}

}
