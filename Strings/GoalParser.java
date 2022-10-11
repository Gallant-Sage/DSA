public class GoalParser {
	public static void main(String[] args) {
		String command = "G()()()()(al)";
		System.out.println(interpret(command));
	}

	static String interpret(String command) {
        
        for(int i = 0; i < command.length(); i++) {
        	command = command.replace("()", "o");
        	command = command.replace("(al)", "al");
        }

        return command;
    }
}