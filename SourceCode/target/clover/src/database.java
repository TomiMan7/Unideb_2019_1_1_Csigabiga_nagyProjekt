/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Ebbe az oszt\u00e1lyba ker\u00fclnek azok a f\u00fcggv\u00e9nyek amik a programhoz
 * sz\u00fcks\u00e9ges adatb\u00e1zis kezel\u00e9ssel kapcsolatosak.
 */
public class database
{public static class __CLR4_3_13030k2rvcgqi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0044\u003a\u005c\u005c\u0050\u0054\u0049\u005f\u004a\u0065\u0067\u0079\u0065\u007a\u0065\u0074\u0065\u006b\u005f\u0075\u006e\u0064\u005f\u0073\u0074\u0075\u0066\u0066\u005c\u005c\u0073\u007a\u006f\u0066\u0074\u006d\u006f\u0064\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0055\u006e\u0069\u0064\u0065\u0062\u005f\u0032\u0030\u0031\u0039\u005f\u0031\u005f\u0031\u005f\u0043\u0073\u0069\u0067\u0061\u0062\u0069\u0067\u0061\u005f\u006e\u0061\u0067\u0079\u0050\u0072\u006f\u006a\u0065\u006b\u0074\u005c\u005c\u0053\u006f\u0075\u0072\u0063\u0065\u0043\u006f\u0064\u0065\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1573322082807L,8589935092L,126,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String connection = "";
    static ResultSet  rs   = null;
    static Statement  st   = null;
    static Connection conn = null;
//st.executeUpdate(lekerdezes);
    public static void Connect()
    {try{__CLR4_3_13030k2rvcgqi.R.inc(108);
        __CLR4_3_13030k2rvcgqi.R.inc(109);String AdatbazisElerhetosege = new String("127.0.0.1");
        __CLR4_3_13030k2rvcgqi.R.inc(110);String Felhasznalonev        = new String("root");
        __CLR4_3_13030k2rvcgqi.R.inc(111);String AdatbazisAzonosito    = new String("csiga");
        __CLR4_3_13030k2rvcgqi.R.inc(112);String Jelszo             = new String("");
        __CLR4_3_13030k2rvcgqi.R.inc(113);connection = "jdbc:mysql://" + AdatbazisElerhetosege + "/" + AdatbazisAzonosito + "?user=" + Felhasznalonev+ "&password=" + Jelszo;
        //connection = "jdbc:mysql://127.0.0.1/csiga?user=root&password= ";

        __CLR4_3_13030k2rvcgqi.R.inc(114);try
        {
            __CLR4_3_13030k2rvcgqi.R.inc(115);conn = DriverManager.getConnection(connection);
        }
        catch (SQLException e)
        {
            __CLR4_3_13030k2rvcgqi.R.inc(116);System.out.println(e);
        }
    }finally{__CLR4_3_13030k2rvcgqi.R.flushNeeded();}}

    public static void Query()
    {try{__CLR4_3_13030k2rvcgqi.R.inc(117);
        __CLR4_3_13030k2rvcgqi.R.inc(118);try {
            __CLR4_3_13030k2rvcgqi.R.inc(119);st   = conn.createStatement();
            __CLR4_3_13030k2rvcgqi.R.inc(120);rs   = st.executeQuery("select * from users");

            __CLR4_3_13030k2rvcgqi.R.inc(121);String username = rs.getString(1);
            __CLR4_3_13030k2rvcgqi.R.inc(122);String email = rs.getString(2);
            __CLR4_3_13030k2rvcgqi.R.inc(123);String password = rs.getString(3);

            __CLR4_3_13030k2rvcgqi.R.inc(124);mainPage.aruInfo.setText(username + " " + email + " " + password);
        }
        catch (SQLException e)
        {
            __CLR4_3_13030k2rvcgqi.R.inc(125);System.out.println("Nem sikerult a kereses!");
        }

    }finally{__CLR4_3_13030k2rvcgqi.R.flushNeeded();}}

}
