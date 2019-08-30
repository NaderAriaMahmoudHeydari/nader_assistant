package com.nader.aria.nader_assistant.util;


import com.nader.aria.nader_assistant.entities.account.Login;
import com.nader.aria.nader_assistant.entities.life.Aim;
import com.nader.aria.nader_assistant.entities.life.Life;
import com.nader.aria.nader_assistant.entities.life.Sprint;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.*;

import java.util.stream.Stream;

public interface Utils {

    public static String passwordDigest(String password, String salt){

        if( password == null || password.isEmpty() || salt == null || salt.isEmpty() ){
            throw new IllegalArgumentException("password or salt is null;");
        }

        try{

            MessageDigest messageDigest = MessageDigest.getInstance("MD5");

            final int halValue = salt.length()/2;
            final String firstPart = salt.substring(0,halValue)+"AssistantProject";
            final String secondPart = salt.substring(halValue)+"NADER_ARIA";
            messageDigest.update(firstPart.getBytes());
            messageDigest.update(password.getBytes());
            messageDigest.update(secondPart.getBytes());

            return new String(messageDigest.digest(), StandardCharsets.UTF_8);

        }catch (NoSuchAlgorithmException e){
            throw new RuntimeException("Can't Convert Password to SecretKey; ");
        }

    }

    @Deprecated//"use Parameter class methods, also add and getParams methods;"
    public static Map<String,Object> getParams(Parameter... parameters){

        Map<String,Object> temp = new HashMap<>();

        Stream.of(parameters).forEach(p-> temp.put(p.getKey(),p.getValue()));

        return temp;
    }

    public static ResourceBundle getBundle(){

        return ResourceBundle.getBundle(VariablesDefault.LANGUAGE,getLocale(VariablesDefault.EN,VariablesDefault.US));
    }

    public static ResourceBundle getBundle(Locale locale){

        return ResourceBundle.getBundle(VariablesDefault.LANGUAGE,locale);

    }


    public static Locale getLocale(String languagePrefix, String countryPrefix){

        return new Locale(languagePrefix,countryPrefix);
    }

  /*  @Deprecated
    public static Stage getMainStage(){
        return (Stage) Session.getInstance().get(VariablesDefault.MAIN_STAGE).orElseThrow(NullPointerException::new);
    }


    @Deprecated
    public static File showImageChooser(){

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle(VariablesDefault.SELECT_IMAGE_CHOOSER_TITLE);

        final List<FileChooser.ExtensionFilter> extensionFilters = new ArrayList<>();
        extensionFilters.add(new FileChooser.ExtensionFilter("JPG", "*.jpg"));
        extensionFilters.add(new FileChooser.ExtensionFilter("GIF", "*.gif"));
        extensionFilters.add(new FileChooser.ExtensionFilter("BMP", "*.bmp"));
        extensionFilters.add(new FileChooser.ExtensionFilter("PNG", "*.png"));

        fileChooser.getExtensionFilters().addAll(extensionFilters);

        fileChooser.setInitialDirectory(new File(System.getProperty(VariablesDefault.USER_HOME)));
        File chooser = fileChooser.showOpenDialog(getMainStage());
        if( chooser != null && chooser.isFile() && chooser.canRead() ){
            return chooser;
        }
        return  null;

    }

    public static byte[] extractImageToBytes(Image image) throws IOException {

        final String IMAGE_IS_NULL = "image is null can't converted.";
        if( image != null ) {

            BufferedImage bufferedImage = SwingFXUtils.fromFXImage( image , null);
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", outputStream);
            byte[] imageArray  = outputStream.toByteArray();
            outputStream.close();
            return imageArray;
        }

        throw new NullPointerException(IMAGE_IS_NULL);
    }
*/

   /* public static UserStateInfoModel getUserStateInfoModel(){

        return  (UserStateInfoModel) Session.getInstance()
                                            .get(VariablesDefault.USER_STATE_INFO_MODEL)
                                            .orElse(new UserStateInfoModel());
    }*/

   /*@Deprecated
    public static ObservableList<String> createObservableList(List<String> list) {

        return FXCollections.observableArrayList(list);
    }*/


    public static LocalDate convertStringToLocalDate(String localDateString) throws DateTimeParseException,NullPointerException {

        if( localDateString == null || localDateString.isEmpty() ){
            throw new NullPointerException("localDateTime should be not empty or null");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("yyyy-MM-dd")
                .optionalStart()
                .optionalEnd()
                .toFormatter();

        return  LocalDate.parse(localDateString, formatter);


    }

    public static LocalTime convertStringToLocalTime(String localTimeString) throws DateTimeParseException {

        if( localTimeString == null || localTimeString.isEmpty() ){
            throw new NullPointerException("localDateTime should be not empty or null");
        }

        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendPattern("HH:mm:ss")
                .optionalStart()
                .optionalEnd()
                .toFormatter();

        return LocalTime.parse(localTimeString,formatter);

    }
    public static Login getCurrentLogin(){
        return (Login) Session.getInstance().get(VariablesDefault.SE_LOGIN).orElseThrow(NullPointerException::new);
    }

    public static Life getCurrentLife(){
        return (Life) Session.getInstance().get(VariablesDefault.SE_LIFE).orElseThrow(NullPointerException::new);
    }

    public static Aim getCurrentAim() {

        return (Aim) Session.getInstance().get(VariablesDefault.SE_AIM).orElseThrow(NullPointerException::new);
    }

    public static Sprint getCurrentSprint(){

        return (Sprint) Session.getInstance().get(VariablesDefault.SE_SPRINT).orElseThrow(NullPointerException::new);
    }

    public static String[] convertListStringToArray(List<String> list) {

        String[] temp = new String[list.size()];
        list.toArray(temp);

        return temp;
    }

    public static String convertLogsToStringFormat(int sumLogs){


        final int DAY_CONSTANT = 86400;
        final int HOURS_CONSTANT = 3600;
        final int MINUTES_CONSTANT = 60;


        StringBuilder stringBuilder = new StringBuilder();

        if( sumLogs >=  DAY_CONSTANT ){

            int days = sumLogs/DAY_CONSTANT;
            sumLogs = sumLogs - (days * DAY_CONSTANT);

            stringBuilder.append(days);
            stringBuilder.append("d ");
        }

        if( sumLogs >= HOURS_CONSTANT ){

            int hours = sumLogs / HOURS_CONSTANT;
            sumLogs = sumLogs - ( hours * HOURS_CONSTANT );

            stringBuilder.append(hours);
            stringBuilder.append("h ");
        }

        if( sumLogs >= MINUTES_CONSTANT ){

            int minutes = sumLogs / MINUTES_CONSTANT;
            sumLogs = sumLogs - ( minutes * MINUTES_CONSTANT );

            stringBuilder.append(minutes);
            stringBuilder.append("m ");
        }

        stringBuilder.append(sumLogs);
        stringBuilder.append("s");

        return stringBuilder.toString();
    }
}
