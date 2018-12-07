Visual studio code (vscode) plugin/extension containing snippets for Bootstrap 4, Font awesome 4, Font Awesome 5 Free & Pro snippets/live templates
=================================================================================================================================================

This plugin works in both in the stable & the insiders build

![Plugin in action](help.gif)

The detailed list of supported template triggers are listed [below](#documentation)

Feel free to let me know what else you want added via the [issues](https://github.com/1tontech/bootstrap4-snippets/issues)

Suggestions, feedback and other comments welcome via [@1tontech](https://twitter.com/1tontech) on Twitter.

## Usage


Create a new HTML document and

1. Type `mat-` for all material components. Use `@mat` for all material attribute directives. `mat` comes from `*mat*erial design`
2. Type `@fx` for all flex layout attribute directives. `fx` comes from `flex layout`
3. Type `td-` for all teradata covalent components. Use `@td` for all teradata covalent attribute directives. `td` comes from `tera data` which is the company responsible for covalent development. `td` is quite similar to `mat`

`Ctrl+Space` will trigger autocomplete dialog for snippet selection

> 1. For autocompletion of components, use hyphen `-` format. i.e for material button, type `mat-button`
> 2. For autocompletion of attribute directives, use `@` format. i.e for flex layout, use `@fxLayout` (or) use `@matTooltip` for material tooltip

Here are the conventions that will make it easy to lookup templates

1. If a tag supports multiple children, the template trigger version with `*` implies the template uses dynamic number of children `*ngFor` variation. The `*` comes from `*ngFor`
2. If a template trigger has `$` variation, this snippet gives you the reactive variation of an input component (or) observable variation if not an input. `$` comes from the fact each reactive component acts as observable source & observable variable names usually end with a `$`)
3. If a template trigger has `@` variation, this snippet targets the attribute of an html element in your markup. Think of `@` as `html attribute`
4. If a template trigger has `:**` variation, this means this variation contains the maximum number of options for that component. `**` comes from [ant](https://ant.apache.org/manual/dirtasks.html) which matches all the files under folder & sub folders
5. If a template trigger has `_`(underscore) variation, this is a snippet(partial) that can be added to the component. This exists mainly to avoid creating variations of all permutations for the base component
6. If a template trigger has `+` variation, this snippet allows you to specify responsive variation
7. If a template trigger has `:?` variation, the template contains additional help that helps you completely utilize the existing templates

## Mind map
1. `*` => `*ngFor` variation
2. `$` => Reactive version of input (or) Observable variation if component is not an input
3. `@` => Targets html attribute
4. `:**` => maximum variations
5. `_` => Html snippet
6. `+` => Responsive variations
7. `:?` => Help

## Installation (in 2 easy steps)

1. Install plugin
  1. Press `F1`, paste `ext install angular-material` & then press `enter` (or)
  2. Goto extensions by pressing `Ctrl-Shift-X` (Windows/Linux) or `Cmd-Shift-X` (Mac) & Search for `Angular material v2`, click on install
2. Reload your editor

You are good to go

## Contribution guidelines

1. Clone this repo
2. To modify material templates, you can find the templates for each snippet under `snippets/material`. These html templates must follow [sublime text snippet](http://docs.sublimetext.info/en/latest/extensibility/snippets.html) format.
5. If you need to change `README.md` (or) `package.json`, you should modify their templates (which are used to generate the actual files) under `src/util/resources`. For eg., If you want `package.json` within plugin to be modified, you should change `package-template.json` under `src/util/resources`. A new `package.json` & `README.md` are regenerated for every build from their corresponding templates.
6. Send me a pull request

## Changelog

See [here](CHANGELOG.md)

## Documentation
Here are available live templates

### Bootstrap 4 snippets

#### Bootstrap

Trigger | Description
--- | ---
b4-**bootstrap$** | Reactive form variation of Bootstrap

#### Alert

Trigger | Description
--- | ---
b4-**alert-additional-content** | Alert additional content
b4-**alert-closable** | Alert closable
b4-**alert-default** | Alert default
b4-**alert-dismissible** | Alert dismissible
b4-**alert-link** | Alert link

#### Badge

Trigger | Description
--- | ---
b4-**badge-button** | Badge button
b4-**badge-default** | Badge default
b4-**badge-heading** | Badge heading
b4-**badge-link** | Badge link
b4-**badge-pill** | Badge pill

#### Bgroup

Trigger | Description
--- | ---
b4-**bgroup-default** | Bgroup default
b4-**bgroup-dropdown-vertical** | Bgroup dropdown vertical
b4-**bgroup-dropdown** | Bgroup dropdown
b4-**bgroup-size** | Bgroup size
b4-**bgroup-toolbar** | Bgroup toolbar

#### Breadcrumb

Trigger | Description
--- | ---
b4-**breadcrumb-default** | Breadcrumb default
b4-**breadcrumb-list** | Breadcrumb list

#### Button

Trigger | Description
--- | ---
b4-**button-a** | Button with link
b4-**button-block** | Button block
b4-**button-checkbox** | Button checkbox
b4-**button-default** | Button default
b4-**button-disabled-a** | Button disabled with link
b4-**button-input** | Button input
b4-**button-outline** | Button outline
b4-**button-radio** | Button radio
b4-**button-sizes** | Button sizes
b4-**button-toggle** | Button toggle

#### Card

Trigger | Description
--- | ---
b4-**card-align** | Card align
b4-**card-background-custom** | Card background custom
b4-**card-background** | Card background
b4-**card-blockquote** | Card blockquote
b4-**card-border** | Card border
b4-**card-columns** | Card columns
b4-**card-decks** | Card decks
b4-**card-default** | Card default
b4-**card-grid** | Card grid
b4-**card-groups** | Card groups
b4-**card-head-foot** | Card head foot
b4-**card-links** | Card links
b4-**card-list** | Card list
b4-**card-overlay** | Card overlay
b4-**card-pill-head** | Card pill head
b4-**card-subtitle** | Card subtitle
b4-**card-tab-head** | Card tab head

#### Carousel

Trigger | Description
--- | ---
b4-**carousel-caption** | Carousel caption
b4-**carousel-default** | Carousel default

#### Collapse

Trigger | Description
--- | ---
b4-**collapse-accordion** | Collapse accordion
b4-**collapse-button** | Collapse button
b4-**collapse-default** | Collapse default

#### Dropdown

Trigger | Description
--- | ---
b4-**dropdown-alignment** | Dropdown alignment
b4-**dropdown-anchor** | Dropdown anchor
b4-**dropdown-button** | Dropdown button
b4-**dropdown-colored** | Dropdown colored
b4-**dropdown-default** | Dropdown default
b4-**dropdown-sized** | Dropdown sized
b4-**dropdown-split** | Dropdown split
b4-**dropdown-up-split** | Dropdown up split
b4-**dropdown-up** | Dropdown up

#### Form

Trigger | Description
--- | ---
b4-**form-checkbox-custom** | Form checkbox custom
b4-**form-checkbox-inline** | Form checkbox inline
b4-**form-checkbox-nolabel** | Form checkbox nolabel
b4-**form-checkbox** | Form checkbox
b4-**form-email** | Form email
b4-**form-file-custom** | Form file custom
b4-**form-file** | Form file
b4-**form-grid** | Form grid
b4-**form-group-text** | Form group text
b4-**form-group** | Form group
b4-**form-help-text-inline** | Form help text inline
b4-**form-help-text** | Form help text
b4-**form-hidden** | Form hidden
b4-**form-inline** | Form inline
b4-**form-input-sizing** | Form input sizing
b4-**form-input-text** | Form input text
b4-**form-input** | Form input
b4-**form-multi-select-custom** | Form multi select custom
b4-**form-multi-select** | Form multi select
b4-**form-multil-select-sizing** | Form multil select sizing
b4-**form-password** | Form password
b4-**form-radio-custom** | Form radio custom
b4-**form-radio-inline** | Form radio inline
b4-**form-radio-nolabel** | Form radio nolabel
b4-**form-radio** | Form radio
b4-**form-reset** | Form reset
b4-**form-select-custom** | Form select custom
b4-**form-select-sizing** | Form select sizing
b4-**form-select** | Form select
b4-**form-submit** | Form submit
b4-**form-textarea** | Form textarea
b4-**form-validation** | Form validation

#### Igroup

Trigger | Description
--- | ---
b4-**igroup-button** | Igroup button
b4-**igroup-checkbox-radio** | Igroup checkbox radio
b4-**igroup-dropdown-segmented** | Igroup dropdown segmented
b4-**igroup-dropdown** | Igroup dropdown
b4-**igroup-size** | Igroup size
b4-**igroup-text-both** | Igroup text both
b4-**igroup-text-prefix** | Igroup text prefix
b4-**igroup-text-sufix** | Igroup text sufix

#### Jumbotron

Trigger | Description
--- | ---
b4-**jumbotron-default** | Jumbotron default
b4-**jumbotron-fluid** | Jumbotron fluid

#### List

Trigger | Description
--- | ---
b4-**list-a** | List with link
b4-**list-badge** | List badge
b4-**list-button** | List button
b4-**list-colors** | List colors
b4-**list-custom** | List custom
b4-**list-default** | List default

#### Modal

Trigger | Description
--- | ---
b4-**modal-customize** | Modal customize
b4-**modal-default** | Modal default
b4-**modal-grid** | Modal grid
b4-**modal-sizes** | Modal sizes

#### Nav

Trigger | Description
--- | ---
b4-**nav-a** | Nav with link
b4-**nav-complete** | Nav complete
b4-**nav-tabs-pills-a-variation** | Nav tabs pills with link variation
b4-**nav-tabs-pills-dropdown** | Nav tabs pills dropdown
b4-**nav-tabs-pills-ul-variation** | Nav tabs pills ul variation
b4-**nav-ul** | Nav ul

#### Navbar

Trigger | Description
--- | ---
b4-**navbar-background-color** | Navbar background color
b4-**navbar-background** | Navbar background
b4-**navbar-default** | Navbar default
b4-**navbar-minimal-a** | Navbar minimal with link
b4-**navbar-minimal-ul** | Navbar minimal ul
b4-**navbar-non-responsive** | Navbar non responsive
b4-**navbar-placement** | Navbar placement

#### Pagination

Trigger | Description
--- | ---
b4-**pagination-alignment** | Pagination alignment
b4-**pagination-default** | Pagination default
b4-**pagination-sized** | Pagination sized

#### Popover

Trigger | Description
--- | ---
b4-**popover-default** | Popover default
b4-**popover-direction** | Popover direction
b4-**popover-dismissable** | Popover dismissable

#### Progress

Trigger | Description
--- | ---
b4-**progress-colored** | Progress colored
b4-**progress-default** | Progress default
b4-**progress-ie9** | Progress ie9
b4-**progress-striped** | Progress striped

#### Scrollspy

Trigger | Description
--- | ---
b4-**scrollspy-default** | Scrollspy default

#### Tooltip

Trigger | Description
--- | ---
b4-**tooltip-default** | Tooltip default

#### Figure

Trigger | Description
--- | ---
b4-**figure-default** | Figure default

#### Image

Trigger | Description
--- | ---
b4-**image-default** | Image default

#### Table

Trigger | Description
--- | ---
b4-**table-default** | Table default
b4-**table-special** | Table special

#### Typography

Trigger | Description
--- | ---
b4-**typography-blockquote-reverse** | Typography blockquote reverse
b4-**typography-blockquote** | Typography blockquote
b4-**typography-description-list** | Typography description list
b4-**typography-display-heading** | Typography display heading
b4-**typography-lead** | Typography lead
b4-**typography-list-inline** | Typography list inline
b4-**typography-list-unstyled** | Typography list unstyled
b4-**typography-muted-text** | Typography muted text

#### Grid

Trigger | Description
--- | ---
b4-**grid-col** | Grid col
b4-**grid-container-fluid** | Grid container fluid
b4-**grid-container** | Grid container
b4-**grid-default** | Grid default
b4-**grid-row** | Grid row

#### Media

Trigger | Description
--- | ---
b4-**media-bottom** | Media bottom
b4-**media-default** | Media default
b4-**media-list** | Media list
b4-**media-middle** | Media middle
b4-**media-nesting** | Media nesting
b4-**media-right** | Media right
b4-**media-top** | Media top

#### Responsive

Trigger | Description
--- | ---
b4-**responsive-hide-down** | Responsive hide down
b4-**responsive-hide-up** | Responsive hide up
b4-**responsive-print-show** | Responsive print show


### Font Awesome 4 icon snippets
@@@GENERATED_FONT_AWESOME4_ICON_SNIPPETS@@@

### Font Awesome 5 Free icon snippets
@@@GENERATED_FONT_AWESOME5_FREE_ICON_SNIPPETS@@@

### Font Awesome 5 Pro icon snippets
@@@GENERATED_FONT_AWESOME5_PRO_ICON_SNIPPETS@@@

## License

Bootstrap 4, Font Awesome 4, Font Awesome 5 Free & Pro - Visual studio code plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).
