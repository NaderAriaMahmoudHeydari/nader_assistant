package com.nader.aria.nader_assistant.util;


public final class VariablesDefault {

    public static final String LANGUAGE = "Language";
    public static final String EN = "en";
    public static final String US = "us";

    //Pages Address;
    public static final String ACCOUNT_PAGES = "/account";
    public static final String SHOW_LOGIN_PAGE = "/loginPage";
    public static final String LOGIN_PAGE = "publics/loginPage";
    public static final String SHOW_REGISTER_USER_PAGE ="/showRegisterUserPage";
    public static final String REGISTER_PAGE = "publics/registerPage";
    public static final String FORGOT_PASSWORD_PAGE = "publics/forgotPasswordPage";
    public static final String USER_INDEX_PAGE = "protecteds/homePage";
    public static final String AIM_PAGE = "protecteds/aimPage";
    public static final String SPRINT_PAGE = "protecteds/sprintPage";
    public static final String TASK_PAGE = "protecteds/taskPage";
    public static final String LIFE_PAGE = "protecteds/lifePage";
    public static final String ERROR_505_PAGE = "publics/error505";

    //Path Address;
    public static final String REDIRECT = "redirect:";
    public static final String ROOT = "/";

    public static final String SIGN_IN = "/signIn";
    public static final String LOGOUT = "/logout";
    public static final String REQUEST_SHOW_FORGOT_PASSWORD_PAGE = "/showForgotPassword";

    public static final String AIM = "/aim";
    public static final String SHOW_AIMS_PAGE = "/showAimsPage";
    public static final String SAVE_NEW_AIM = "/saveNewAim";
    public static final String UPDATE_AIM = "/updateAim";
    public static final String ADD_TASK = "/addTask/{aimId}";
    public static final String SHOW_TASKS ="/showTasks";
    public static final String GET_AIMS = "/getAims/{lifeId}";
    public static final String GET_NEW_AIM_CODE= "/getNewAimCode";
    public static final String GET_AIMS_COUNT = "/getAimsCount/{lifeId}";
    public static final String GET_SELECTED_AIM = "/getSelectedAim/{aimId}";
    public static final String DELETE_SELECTED_AIM = "/deletedAim";

    public static final String SPRINT = "/sprint";
    public static final String SHOW_SPRINTS_PAGE = "/showSprintsPage";
    public static final String SAVE_NEW_SPRINT = "/saveNewSprint";
    public static final String UPDATE_SPRINT = "/updateSprint";
    public static final String GET_SPRINTS = "/getSprints/{lifeId}";
    public static final String GET_NEW_SPRINT_CODE= "/getNewSprintCode";
    public static final String GET_SPRINTS_COUNT = "/getSprintsCount/{lifeId}";
    public static final String GET_SELECTED_SPRINT = "/getSelectedSprint/{sprintId}";
    public static final String DELETE_SELECTED_SPRINT = "/deletedSprint";

    public static final String TASK = "/task";
    public static final String SHOW_TASKS_PAGE = "/showTasksPage";
    public static final String GET_NEW_TASK_CODE = "/getNewTaskCode";
    public static final String SAVE_NEW_TASK = "/saveNewTask";
    public static final String GET_SELECTED_TASK = "/getSelectedTask/{taskId}";
    public static final String UPDATE_TASK = "/updateTask";
    public static final String DELETED_TASK = "/deletedTask";
    public static final String AIM_TASK_MANAGER = "/aimTaskManager/{aimId}";
    public static final String SPRINT_TASK_MANAGER = "/sprintTaskManager/{sprintId}";
    public static final String GET_AIMS_CODE_LIST = "/getAimsCodeList";
    public static final String GET_SPRINTS_CODE_LIST = "/getSprintsCodeList";
    public static final String GET_TASKS_CODE_LIST = "/getTasksCodeList";



    public static final String SHOW_USER_LIFE = "/showUserLife";
    public static final String LIFE ="/life_service";

    public static final String GET_MENU_LIST = "/menuList";


    public static final String GET_REGISTER_MODEL = "/getRegisterModel";
    public static final String REGISTER_USER = "/registerUser";
    public static final String GET_PROFILE = "/getProfile";
    public static final String UPDATE_PROFILE = "/updateProfile";

    public static final String GET_FORGOT_PASSWORD_MODEL  = "/getForgotPasswordModel";
    public static final String FORGOT_PASSWORD = "/forgotPassword";
    public static final String URL_PARAM_LOGIN_ID = "{loginId}";
    public static final String HOME = "/home";
    public static final String USER_PARAM_ID = "{userId}";


    //Errors Path
    public static final String ERRORS = "/errors";
    public static final String INTERNAL_SERVER_ERROR = "/500";


    //Keys
    public static final String ASSISTANT = "Assistant";
    public static final String MAIN_STAGE = "mainStage";
    public static final String MAIN_FORM = "MainForm";
    public static final String SELECT_IMAGE_CHOOSER_TITLE = "Find Image and Select Them";

    //Paths
    public static final String USER_HOME = "user.home";

    //Icon
    public static final String APP_ICON = "/com/nader/aria/assistant/view/resources/images/life_service.png";
    public static final String LOGOUT_BUTTON_ICON ="/com/nader/aria/assistant/view/resources/images/logout.png";
    public static final String EXIT_BUTTON_ICON = "/com/nader/aria/assistant/view/resources/images/exit.png";
    public static final String MAIN_MENU_ACCOUNT_ICON = "/com/nader/aria/assistant/view/resources/images/account.png";
    public static final String MAIN_MENU_LIFE_ICON = "/com/nader/aria/assistant/view/resources/images/life_service.png";
    public static final String MAIN_MENU_FINANCIAL_ICON = "/com/nader/aria/assistant/view/resources/images/financial.png";

    //Session
    public static final String USER_STATE_INFO_MODEL = "userStateInfoModel";
    public static final String LIFE_INFO_PANE = "lifeInfoPane";

    @Deprecated
    public static final String MAIN_PANE = "mainPane";
    public static final String CENTER_PANE = "centerPane";
    public static final String CORE_CONTROLLER = "coreController";

    //Main Menu Names
    public static final String MAIN_MENU_ACCOUNT = "Account";
    public static final String MAIN_MENU_LIFE = "Life";
    public static final String MAIN_MENU_FINANCIAL = "Financial";

    //Sub Menu Names
    public static final String SUB_MENU_PROFILE = "Profile";

    //Life SubMenus
    public static final String SUB_MENU_NEW_AIM = "New Aim";
    public static final String SUB_MENU_AIMS = "Aims";
    public static final String SUB_MENU_NEW_SPRINT = "New Sprint";
    public static final String SUB_MENU_SPRINTS = "Sprints";
    public static final String SUB_MENU_NEW_TASK = "New Task";
    public static final String SUB_MENU_TASKS = "Tasks";

    //FINANCIAL SubMenus
    public static final String SUB_MENU_FUND_MANAGER = "Funds";
    public static final String SUB_MENU_NEW_FACTOR = "New Factor";
    public static final String SUB_MENU_FACTORS_LIST = "Factors List";

    //Pans Keys

    public static final String COLON = " : ";
    public static final String BTN_SAVE = "Save";
    public static final String BTN_CANCEL = "Cancel";
    public static final String BTN_UPDATE = "Update";
    public static final String BTN_SHOW_LIST = "Show List";
    public static final String STATE_TYPE = "State Type";
    public static final String START_DATE = "Start Date";
    public static final String END_DATE = "End Date";

    public static final String RANK = "Rank";
    public static final String TC_RANK = "rank";

    public static final String TC_STATE_TYPE = "stateType";
    public static final String TC_ACTION_TITLE = "Command";

    public static final String CODE = "Code";
    public static final String TC_CODE = "code";


    public static final String TITLE = "Title";
    public static final String TC_TITLE = "title";

    public static final String SHOW_PANEL_TITLE_UPDATE_SELECTED = "Update Selected ";
    public static final String UPDATE_NEWLY_SAVED = "Update newly saved item.";




    //Confirmation Keys
    public static final String DELETE_CONFIRMATION_DIALOG_TITLE = "Delete Confirmation";
    public static final String DELETE_CONFIRMATION_DIALOG_HEADER = "delete Confirmation";

    //STYLES Property
    public static final String STYLE_BORDER_COLOR_WHITE = "-fx-border-color: white";
    public static final String STYLE_BACKGROUND_COLOR_GREEN  = "-fx-background-color: green";
    public static final String STYLE_BACKGROUND_COLOR_WHITE = "-fx-background-color: white";
    public static final String STYLE_BACKGROUND_COLOR_DIM_GRAY = "-fx-background-color: dimgray";


    //Sessions Keys
    public static final String SE_LOGIN = "login";
    public static final String SE_LIFE = "life_service";
    public static final String SE_AIM = "aim";
    public static final String SE_SPRINT = "sprint";




}
