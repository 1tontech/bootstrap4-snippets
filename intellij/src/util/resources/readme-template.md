Bootstrap 4, Font awesome 4, Font Awesome 5 Free & Pro snippets for IntelliJ
============================================================================

This plugin is compatible with the following JetBrains products:

- IntelliJ IDEA
- WebStorm and PhpStorm
- PyCharm
- RubyMine

![Plugin in action](help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/bootstrap4-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Installation (in 3 easy steps)

To install the plugin open your editor (IntelliJ) and hit:

1. `File > Settings > Plugins` and click on the `Browse repositories` button.
2. Look for `Bootstrap 4` the right click and select `Download plugin`.
3. Finally hit the `Apply` button, agree to restart your IDE and you're all done!

## Usage

To use the bootstrap snippets, open a HTML file, and start typing `b4-`, followed by pressing `Ctrl+Space`. A list of bootstrap snippets will show up

To use font awesome 4 snippets, open a HTML file, and start typing `fa4-`, the editor will show you all the snippets

To use font awesome 5 free snippets, open a HTML file, and start typing `fa5-`, the editor will show you all the snippets

To use font awesome 5 pro snippets, open a HTML file, and start typing `fa5p-`, the editor will show you all the snippets

The detailed list of supported actions are listed below under documentation section

Here are the conventions that will make it easy to lookup templates

If a template trigger starts with `@` variation, this snippet targets the attribute of an html element in your markup. Think of `@` as `html attribute`

## Mind map

`@` => Targets html attribute

## Contribution guidelines

1. Clone this repo
2. To modify bootstrap templates, you can find the templates for each snippet under `../snippets/bootstrap`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
3. To modify font awesome snippets, you would need to modify `font-awesome*-icons*.yml` under `../snippets`
4. If you need to change `README.md` (or) `plugin.xml`, you should modify their templates (which are used to generate the actual files) under `src/util/resources`. For eg., If you want `plugin.xml` within plugin to be modified, you should change `plugin-template.xml` under `src/util/resources`. A new `plugin.xml` & `README.md` are regenerated for every build from their corresponding templates.
5. Send me a pull request

## Changelog

See [here](CHANGELOG.md)

## Documentation

Here are available live templates

### Bootstrap 4 snippets
@@@GENERATED_BOOTSTRAP_SNIPPETS@@@

### Font Awesome 4 icon snippets
@@@GENERATED_FONT_AWESOME4_ICON_SNIPPETS@@@

### Font Awesome 5 Free icon snippets
@@@GENERATED_FONT_AWESOME5_FREE_ICON_SNIPPETS@@@

### Font Awesome 5 Pro icon snippets
@@@GENERATED_FONT_AWESOME5_PRO_ICON_SNIPPETS@@@

## About Me

You can find my personnel blog at [https://thekalinga.in](https://thekalinga.in)

You can connect me with at linkedin @ [https://linkedin.com/in/thekalinga/](https://linkedin.com/in/thekalinga/)

## License

Bootstrap 4, Font Awesome 4, Font Awesome 5 Free & Pro - IntelliJ plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

## Disclaimer

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
