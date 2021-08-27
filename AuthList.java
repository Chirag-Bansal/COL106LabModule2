public class AuthList{

	public static final String start_string = "FW2s85l7UVyqlOtTb3o7NvQCyqZk1gS0yj4VDg5H69QmY8dVKHfPhVhFr5tH7qqe";
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

	public String DeleteFirst(String proof) throws AuthenticationFailedException {
		/*
			Implement Code here
		*/

		return lastNode.dgst;
	}


	public String DeleteLast(String proof) throws AuthenticationFailedException {
		/*
			Implement Code here
		*/

		return lastNode.dgst;
	}


	public static Node RetrieveList(AuthList current, String proof, String data) throws AuthenticationFailedException{
		/*
			Implement Code here
		*/
		return null;
	}

	public void AttackList(AuthList current, String new_data){
		/*
			Implement Code here
		*/
	}

}
