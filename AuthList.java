public class AuthList{

	public static final String start_string = "2018CS50402";
	public Node firstNode;
	public Node lastNode;

	public AuthList(){
		/*
			Implement Code here
		*/
	}

	public static boolean CheckList(AuthList current, String proof) throws AuthenticationFailedException {
		/*
			Implement Code here
		*/

		return true;
	}


	public String InsertNode(Data datainsert, String proof) throws AuthenticationFailedException {
		/*
			Implement Code here
		*/

		return lastNode.dgst;
	}

	public String DeleteFirst(String proof) throws AuthenticationFailedException, EmptyListException {
		/*
			Implement Code here
		*/

		return lastNode.dgst;
	}


	public String DeleteLast(String proof) throws AuthenticationFailedException, EmptyListException {
		/*
			Implement Code here
		*/

		return lastNode.dgst;
	}


	public static Node RetrieveNode(AuthList current, String proof, String data) throws AuthenticationFailedException, DocumentNotFoundException{
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
