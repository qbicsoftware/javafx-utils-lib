package life.qbic.javafx;

import javafx.application.Application;
import life.qbic.cli.AbstractCommand;
import life.qbic.cli.ToolExecutor;

/**
 * Executor that extends {@link ToolExecutor} by providing a method to start JavaFX applications using JavaFX's own framework (i.e., {@link Application#launch(Class, String...)}).
 */
public class JavaFXExecutor extends ToolExecutor {

    /**
     * Invokes a {@link QBiCApplication} with the given parameters.
     *
     * @param applicationClass the class of the application to launch.
     * @param commandClass the class of the commands that the application is able to understand.
     * @param args the command-line arguments.
     */
    public void invokeAsJavaFX(final Class<? extends QBiCApplication> applicationClass, final Class<? extends AbstractCommand> commandClass,
        final String[] args) {
        final AbstractCommand command = validateParametersAndParseCommandlineArguments(applicationClass, commandClass, args);

        if (handleCommonParameters(extractToolMetadata(), command)) {
            return;
        }

        Application.launch(applicationClass, args);
    }

}
