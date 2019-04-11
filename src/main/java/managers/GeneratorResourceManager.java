package managers;

import java.util.ResourceBundle;

public class GeneratorResourceManager
{
  private static final GeneratorResourceManager INSTANCE;
  private final ResourceBundle VALUES;
  private final String RESOURCE_PATH = "GeneratorValues";

  private GeneratorResourceManager()
  { VALUES = ResourceBundle.getBundle(RESOURCE_PATH); }

  static { INSTANCE = new GeneratorResourceManager(); }

  public static GeneratorResourceManager getInstance()
  { return INSTANCE; }

  public String getValue(String key)
  { return VALUES.getString(key); }
}
