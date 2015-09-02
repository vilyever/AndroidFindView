# AndroidFindView
FindViewById无需转换类型

## Import
[JitPack](https://jitpack.io/)

Add it in your project's build.gradle at the end of repositories:

```gradle
repositories {
  // ...
  maven { url "https://jitpack.io" }
}
```

Step 2. Add the dependency in the form

```gradle
dependencies {
  compile 'com.github.vilyever:AndroidFindView:1.0.1'
}
```

## Usage
```java
Button button = VDFindView.findViewById(this, R.id.buttonPanel);
ViewGroup viewGroup = VDFindView.findViewById(this, R.id.action_bar_root);
ImageView imageView = VDFindView.findViewById(viewGroup, R.id.image);
```

## License
[Apache License Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.txt)
