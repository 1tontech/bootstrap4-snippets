Bootstrap 4, Font awesome 4, Font Awesome 5 Free & Pro snippets for Visual studio code
===============================================================================================

Visual studio code plugin containing Bootstrap 4, Font awesome 4 & Font Awesome 5 Free & Pro snippets. This plugin works in both in the stable & the insiders build

![Plugin in action](help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/bootstrap4-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Installation (in 2 easy steps)

1. Install plugin
  1. Press `F1`, paste `ext install bootstrap4-vscode` & then press `enter` (or)
  2. Goto extensions by pressing `Ctrl-Shift-X` (Windows/Linux) or `Cmd-Shift-X` (Mac) & Search for `Bootstrap 4`, click on install
2. Reload your editor

You are good to go

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
4. If you need to change `README.md` (or) `package.json`, you should modify their templates (which are used to generate the actual files) under `src/util/resources`. For eg., If you want `package.json` within plugin to be modified, you should change `package-template.json` under `src/util/resources`. A new `package.json` & `README.md` are regenerated for every build from their corresponding templates.
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

## License

Bootstrap 4, Font Awesome 4, Font Awesome 5 Free & Pro - Visual studio code plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
