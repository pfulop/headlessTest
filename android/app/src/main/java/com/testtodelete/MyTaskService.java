public class MyTaskService extends HeadlessJsTaskService {

  @Override
  protected @Nullable HeadlessJsTaskConfig getTaskConfig(Intent intent) {
      return new HeadlessJsTaskConfig(
          "MeasureInternetz",
          null,
          5000);
  }
}
