package IntegracionBackFront.backfront.Config.Crypto;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Argon2Password
{
    private static final int ITERATIONS = 10;
    private static final int MEMORY = 32768;
    private static final int PARALLELISM = 2;

    private Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);

    public String EncryptPassword(String Password)
    {
        return argon2.hash(ITERATIONS,MEMORY,PARALLELISM,Password);
    }

    public boolean VerifyPassword(String passwordBD, String password)
    {
        return argon2.verify(passwordBD, password);
    }
}
