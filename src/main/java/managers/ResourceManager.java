package managers;

import java.util.ResourceBundle;

public class ResourceManager
{
  private static final ResourceManager INSTANCE;
  private final ResourceBundle VALUES;
  private final String RESOURCE_PATH = "Values";

  private ResourceManager()
  { VALUES = ResourceBundle.getBundle(RESOURCE_PATH); }

  static { INSTANCE = new ResourceManager(); }

  public static ResourceManager getInstance()
  { return INSTANCE; }

  public String getValue(String key)
  { return VALUES.getString(key); }
}
