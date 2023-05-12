package ui;

import java.util.ArrayList;
import java.util.List;

import ui.commands.AddNode;
import ui.commands.Commands;
import ui.commands.Exit;
import ui.commands.PrintNote;
import ui.commands.ReadFile;
import ui.commands.SaveFile;

public class Menu {
    private List<Commands> commands;

    

    public Menu(View view) {
        commands= new ArrayList<>();
        commands.add(new AddNode(view));
        commands.add(new PrintNote(view));
        commands.add(new SaveFile(view));
        commands.add(new ReadFile(view));
        commands.add(new Exit(view));
        


    }

    public void execute(int number) {
        commands.get(number - 1).execute();

    }

    public String printMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
}
