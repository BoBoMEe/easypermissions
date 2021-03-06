package pub.devrel.easypermissions;

import android.support.v4.app.ActivityCompat;
import java.util.List;

public interface PermissionCallback extends ActivityCompat.OnRequestPermissionsResultCallback {

    void onPermissionGranted(int requestCode, List<String> perms);

    void onPermissionDenied(int requestCode, List<String> perms);

}
