package module2.class9;

interface Plugin {
    void execute();
}

class SpellCheckPlugin implements Plugin {
    @Override
    public void execute() {
        System.out.println("Spell check is running...");
    }
}

class GrammarCheckPlugin implements Plugin {
    @Override
    public void execute() {
        System.out.println("Grammar check is running...");
    }
}

public class TextEditor6 {
    public static void main(String[] args) {
        // Simulate loading plugins
        Plugin spellCheckPlugin = new SpellCheckPlugin();
        Plugin grammarCheckPlugin = new GrammarCheckPlugin();

        // Assume these plugins are dynamically loaded based on user configuration

        // Execute the loaded plugins
        executePlugin(spellCheckPlugin);
        executePlugin(grammarCheckPlugin);
    }

    static void executePlugin(Plugin plugin) {
        System.out.println("Executing plugin: " + plugin.getClass().getSimpleName());
        plugin.execute();
        System.out.println();
    }
}
