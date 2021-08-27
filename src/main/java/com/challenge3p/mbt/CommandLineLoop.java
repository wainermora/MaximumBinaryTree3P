package com.challenge3p.mbt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("WeakerAccess")
public class CommandLineLoop {
    private static final String REGEX_COMMA_SEPARATED_NUMBERS = "((\\d\\,(?=\\d))|\\d)+";
    private static final String COMMA = ",";
    private BufferedReader br;
    private MaximumBinaryTreeBuilder builder;
    Pattern pattern = Pattern.compile(REGEX_COMMA_SEPARATED_NUMBERS);


    public CommandLineLoop() {
        this.br = new BufferedReader(new InputStreamReader(System.in));
        this.builder = new MaximumBinaryTreeBuilder();
    }

    public void run() throws Exception {

        while(true) {
            System.out.println("Type the list of numbers separated by comma or type 'exit'");
            System.out.print("> ");

            String line = br.readLine().trim();


            if (line.isEmpty()) {
                continue;
            }
            if (line.toLowerCase().startsWith("exit")) {
                break;
            }

            if(validateInput(line.trim())){
                this.builder.buildAndPrint(toArray(line));
            }else{
                System.out.println("Input invalid, must be a list of numbers separated by comma");
            }

        }
    }

    private boolean validateInput(final String input){
        Matcher matcher = pattern.matcher(input);
        return matcher.find();
    }

    private  int[] toArray(final String input){
        return Arrays.stream(input.split(COMMA)).mapToInt(Integer::parseInt).toArray();
    }


}
