package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;

public class ClearController {
    final ClearInputBoundary clearUserUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUserUseCaseInteractor) {
        this.clearUserUseCaseInteractor = clearUserUseCaseInteractor;
    }

    public void execute() {
        clearUserUseCaseInteractor.execute();
    }
}
