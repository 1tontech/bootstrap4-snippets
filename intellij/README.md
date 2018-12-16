Bootstrap 4, Font awesome 4, Font Awesome 5 Free & Pro snippets for IntelliJ
============================================================================

This plugin is compatible with the following JetBrains products:

- IntelliJ IDEA
- WebStorm and PhpStorm
- PyCharm
- RubyMine

![Plugin in action](https://github.com/1tontech/bootstrap4-snippets/raw/intellij-6.0.3/intellij/help.gif)

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

#### Bootstrap master template

Trigger | Description
--- | ---
b4-**$** | Bootstrap master template

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
b4-**button-a** | Button a
b4-**button-block** | Button block
b4-**button-checkbox** | Button checkbox
b4-**button-default** | Button default
b4-**button-disabled-a** | Button disabled a
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
b4-**list-a** | List a
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
b4-**nav-a** | Nav a
b4-**nav-complete** | Nav complete
b4-**nav-tabs-pills-a-variation** | Nav tabs pills a variation
b4-**nav-tabs-pills-dropdown** | Nav tabs pills dropdown
b4-**nav-tabs-pills-ul-variation** | Nav tabs pills ul variation
b4-**nav-ul** | Nav ul

#### Navbar

Trigger | Description
--- | ---
b4-**navbar-background-color** | Navbar background color
b4-**navbar-background** | Navbar background
b4-**navbar-default** | Navbar default
b4-**navbar-minimal-a** | Navbar minimal a
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

Trigger | Description
--- | ---
fa4-**$** | Font awesome 4 css link
fa4-**500px** | 500px
fa4-**address-book** | Address Book
fa4-**address-book-o** | Address Book Outlined
fa4-**address-card** | Address Card
fa4-**address-card-o** | Address Card Outlined
fa4-**adjust** | adjust
fa4-**adn** | App.net
fa4-**align-center** | align-center
fa4-**align-justify** | align-justify
fa4-**align-left** | align-left
fa4-**align-right** | align-right
fa4-**amazon** | Amazon
fa4-**ambulance** | ambulance
fa4-**american-sign-language-interpreting** | American Sign Language Interpreting
fa4-**anchor** | Anchor
fa4-**android** | Android
fa4-**angellist** | AngelList
fa4-**angle-double-down** | Angle Double Down
fa4-**angle-double-left** | Angle Double Left
fa4-**angle-double-right** | Angle Double Right
fa4-**angle-double-up** | Angle Double Up
fa4-**angle-down** | angle-down
fa4-**angle-left** | angle-left
fa4-**angle-right** | angle-right
fa4-**angle-up** | angle-up
fa4-**apple** | Apple
fa4-**archive** | Archive
fa4-**area-chart** | Area Chart
fa4-**arrow-circle-down** | Arrow Circle Down
fa4-**arrow-circle-left** | Arrow Circle Left
fa4-**arrow-circle-o-down** | Arrow Circle Outlined Down
fa4-**arrow-circle-o-left** | Arrow Circle Outlined Left
fa4-**arrow-circle-o-right** | Arrow Circle Outlined Right
fa4-**arrow-circle-o-up** | Arrow Circle Outlined Up
fa4-**arrow-circle-right** | Arrow Circle Right
fa4-**arrow-circle-up** | Arrow Circle Up
fa4-**arrow-down** | arrow-down
fa4-**arrow-left** | arrow-left
fa4-**arrow-right** | arrow-right
fa4-**arrow-up** | arrow-up
fa4-**arrows** | Arrows
fa4-**arrows-alt** | Arrows Alt
fa4-**arrows-h** | Arrows Horizontal
fa4-**arrows-v** | Arrows Vertical
fa4-**assistive-listening-systems** | Assistive Listening Systems
fa4-**asterisk** | asterisk
fa4-**at** | At
fa4-**audio-description** | Audio Description
fa4-**backward** | backward
fa4-**balance-scale** | Balance Scale
fa4-**ban** | ban
fa4-**bandcamp** | Bandcamp
fa4-**bar-chart** | Bar Chart
fa4-**barcode** | barcode
fa4-**bars** | Bars
fa4-**bath** | Bath
fa4-**battery-empty** | Battery Empty
fa4-**battery-full** | Battery Full
fa4-**battery-half** | Battery 1/2 Full
fa4-**battery-quarter** | Battery 1/4 Full
fa4-**battery-three-quarters** | Battery 3/4 Full
fa4-**bed** | Bed
fa4-**beer** | beer
fa4-**behance** | Behance
fa4-**behance-square** | Behance Square
fa4-**bell** | bell
fa4-**bell-o** | Bell Outlined
fa4-**bell-slash** | Bell Slash
fa4-**bell-slash-o** | Bell Slash Outlined
fa4-**bicycle** | Bicycle
fa4-**binoculars** | Binoculars
fa4-**birthday-cake** | Birthday Cake
fa4-**bitbucket** | Bitbucket
fa4-**bitbucket-square** | Bitbucket Square
fa4-**black-tie** | Font Awesome Black Tie
fa4-**blind** | Blind
fa4-**bluetooth** | Bluetooth
fa4-**bluetooth-b** | Bluetooth
fa4-**bold** | bold
fa4-**bolt** | Lightning Bolt
fa4-**bomb** | Bomb
fa4-**book** | book
fa4-**bookmark** | bookmark
fa4-**bookmark-o** | Bookmark Outlined
fa4-**braille** | Braille
fa4-**briefcase** | Briefcase
fa4-**btc** | Bitcoin (BTC)
fa4-**bug** | Bug
fa4-**building** | Building
fa4-**building-o** | Building Outlined
fa4-**bullhorn** | bullhorn
fa4-**bullseye** | Bullseye
fa4-**bus** | Bus
fa4-**buysellads** | BuySellAds
fa4-**calculator** | Calculator
fa4-**calendar** | calendar
fa4-**calendar-check-o** | Calendar Check Outlined
fa4-**calendar-minus-o** | Calendar Minus Outlined
fa4-**calendar-o** | calendar-o
fa4-**calendar-plus-o** | Calendar Plus Outlined
fa4-**calendar-times-o** | Calendar Times Outlined
fa4-**camera** | camera
fa4-**camera-retro** | camera-retro
fa4-**car** | Car
fa4-**caret-down** | Caret Down
fa4-**caret-left** | Caret Left
fa4-**caret-right** | Caret Right
fa4-**caret-square-o-down** | Caret Square Outlined Down
fa4-**caret-square-o-left** | Caret Square Outlined Left
fa4-**caret-square-o-right** | Caret Square Outlined Right
fa4-**caret-square-o-up** | Caret Square Outlined Up
fa4-**caret-up** | Caret Up
fa4-**cart-arrow-down** | Shopping Cart Arrow Down
fa4-**cart-plus** | Add to Shopping Cart
fa4-**cc** | Closed Captions
fa4-**cc-amex** | American Express Credit Card
fa4-**cc-diners-club** | Diner's Club Credit Card
fa4-**cc-discover** | Discover Credit Card
fa4-**cc-jcb** | JCB Credit Card
fa4-**cc-mastercard** | MasterCard Credit Card
fa4-**cc-paypal** | Paypal Credit Card
fa4-**cc-stripe** | Stripe Credit Card
fa4-**cc-visa** | Visa Credit Card
fa4-**certificate** | certificate
fa4-**chain-broken** | Chain Broken
fa4-**check** | Check
fa4-**check-circle** | Check Circle
fa4-**check-circle-o** | Check Circle Outlined
fa4-**check-square** | Check Square
fa4-**check-square-o** | Check Square Outlined
fa4-**chevron-circle-down** | Chevron Circle Down
fa4-**chevron-circle-left** | Chevron Circle Left
fa4-**chevron-circle-right** | Chevron Circle Right
fa4-**chevron-circle-up** | Chevron Circle Up
fa4-**chevron-down** | chevron-down
fa4-**chevron-left** | chevron-left
fa4-**chevron-right** | chevron-right
fa4-**chevron-up** | chevron-up
fa4-**child** | Child
fa4-**chrome** | Chrome
fa4-**circle** | Circle
fa4-**circle-o** | Circle Outlined
fa4-**circle-o-notch** | Circle Outlined Notched
fa4-**circle-thin** | Circle Outlined Thin
fa4-**clipboard** | Clipboard
fa4-**clock-o** | Clock Outlined
fa4-**clone** | Clone
fa4-**cloud** | Cloud
fa4-**cloud-download** | Cloud Download
fa4-**cloud-upload** | Cloud Upload
fa4-**code** | Code
fa4-**code-fork** | code-fork
fa4-**codepen** | Codepen
fa4-**codiepie** | Codie Pie
fa4-**coffee** | Coffee
fa4-**cog** | cog
fa4-**cogs** | cogs
fa4-**columns** | Columns
fa4-**comment** | comment
fa4-**comment-o** | comment-o
fa4-**commenting** | Commenting
fa4-**commenting-o** | Commenting Outlined
fa4-**comments** | comments
fa4-**comments-o** | comments-o
fa4-**compass** | Compass
fa4-**compress** | Compress
fa4-**connectdevelop** | Connect Develop
fa4-**contao** | Contao
fa4-**copyright** | Copyright
fa4-**creative-commons** | Creative Commons
fa4-**credit-card** | credit-card
fa4-**credit-card-alt** | Credit Card
fa4-**crop** | crop
fa4-**crosshairs** | Crosshairs
fa4-**css3** | CSS 3 Logo
fa4-**cube** | Cube
fa4-**cubes** | Cubes
fa4-**cutlery** | Cutlery
fa4-**dashcube** | DashCube
fa4-**database** | Database
fa4-**deaf** | Deaf
fa4-**delicious** | Delicious Logo
fa4-**desktop** | Desktop
fa4-**deviantart** | deviantART
fa4-**diamond** | Diamond
fa4-**digg** | Digg Logo
fa4-**dot-circle-o** | Dot Circle Outlined
fa4-**download** | Download
fa4-**dribbble** | Dribbble
fa4-**dropbox** | Dropbox
fa4-**drupal** | Drupal Logo
fa4-**edge** | Edge Browser
fa4-**eercast** | Eercast
fa4-**eject** | eject
fa4-**ellipsis-h** | Ellipsis Horizontal
fa4-**ellipsis-v** | Ellipsis Vertical
fa4-**empire** | Galactic Empire
fa4-**envelope** | Envelope
fa4-**envelope-o** | Envelope Outlined
fa4-**envelope-open** | Envelope Open
fa4-**envelope-open-o** | Envelope Open Outlined
fa4-**envelope-square** | Envelope Square
fa4-**envira** | Envira Gallery
fa4-**eraser** | eraser
fa4-**etsy** | Etsy
fa4-**eur** | Euro (EUR)
fa4-**exchange** | Exchange
fa4-**exclamation** | exclamation
fa4-**exclamation-circle** | Exclamation Circle
fa4-**exclamation-triangle** | Exclamation Triangle
fa4-**expand** | Expand
fa4-**expeditedssl** | ExpeditedSSL
fa4-**external-link** | External Link
fa4-**external-link-square** | External Link Square
fa4-**eye** | Eye
fa4-**eye-slash** | Eye Slash
fa4-**eyedropper** | Eyedropper
fa4-**facebook** | Facebook
fa4-**facebook-official** | Facebook Official
fa4-**facebook-square** | Facebook Square
fa4-**fast-backward** | fast-backward
fa4-**fast-forward** | fast-forward
fa4-**fax** | Fax
fa4-**female** | Female
fa4-**fighter-jet** | fighter-jet
fa4-**file** | File
fa4-**file-archive-o** | Archive File Outlined
fa4-**file-audio-o** | Audio File Outlined
fa4-**file-code-o** | Code File Outlined
fa4-**file-excel-o** | Excel File Outlined
fa4-**file-image-o** | Image File Outlined
fa4-**file-o** | File Outlined
fa4-**file-pdf-o** | PDF File Outlined
fa4-**file-powerpoint-o** | Powerpoint File Outlined
fa4-**file-text** | File Text
fa4-**file-text-o** | File Text Outlined
fa4-**file-video-o** | Video File Outlined
fa4-**file-word-o** | Word File Outlined
fa4-**files-o** | Files Outlined
fa4-**film** | Film
fa4-**filter** | Filter
fa4-**fire** | fire
fa4-**fire-extinguisher** | fire-extinguisher
fa4-**firefox** | Firefox
fa4-**first-order** | First Order
fa4-**flag** | flag
fa4-**flag-checkered** | flag-checkered
fa4-**flag-o** | Flag Outlined
fa4-**flask** | Flask
fa4-**flickr** | Flickr
fa4-**floppy-o** | Floppy Outlined
fa4-**folder** | Folder
fa4-**folder-o** | Folder Outlined
fa4-**folder-open** | Folder Open
fa4-**folder-open-o** | Folder Open Outlined
fa4-**font** | font
fa4-**font-awesome** | Font Awesome
fa4-**fonticons** | Fonticons
fa4-**fort-awesome** | Fort Awesome
fa4-**forumbee** | Forumbee
fa4-**forward** | forward
fa4-**foursquare** | Foursquare
fa4-**free-code-camp** | Free Code Camp
fa4-**frown-o** | Frown Outlined
fa4-**futbol-o** | Futbol Outlined
fa4-**gamepad** | Gamepad
fa4-**gavel** | Gavel
fa4-**gbp** | GBP
fa4-**genderless** | Genderless
fa4-**get-pocket** | Get Pocket
fa4-**gg** | GG Currency
fa4-**gg-circle** | GG Currency Circle
fa4-**gift** | gift
fa4-**git** | Git
fa4-**git-square** | Git Square
fa4-**github** | GitHub
fa4-**github-alt** | GitHub Alt
fa4-**github-square** | GitHub Square
fa4-**gitlab** | GitLab
fa4-**glass** | Glass
fa4-**glide** | Glide
fa4-**glide-g** | Glide G
fa4-**globe** | Globe
fa4-**google** | Google Logo
fa4-**google-plus** | Google Plus
fa4-**google-plus-official** | Google Plus Official
fa4-**google-plus-square** | Google Plus Square
fa4-**google-wallet** | Google Wallet
fa4-**graduation-cap** | Graduation Cap
fa4-**gratipay** | Gratipay (Gittip)
fa4-**grav** | Grav
fa4-**h-square** | H Square
fa4-**hacker-news** | Hacker News
fa4-**hand-lizard-o** | Lizard (Hand)
fa4-**hand-o-down** | Hand Outlined Down
fa4-**hand-o-left** | Hand Outlined Left
fa4-**hand-o-right** | Hand Outlined Right
fa4-**hand-o-up** | Hand Outlined Up
fa4-**hand-paper-o** | Paper (Hand)
fa4-**hand-peace-o** | Hand Peace
fa4-**hand-pointer-o** | Hand Pointer
fa4-**hand-rock-o** | Rock (Hand)
fa4-**hand-scissors-o** | Scissors (Hand)
fa4-**hand-spock-o** | Spock (Hand)
fa4-**handshake-o** | Handshake Outlined
fa4-**hashtag** | Hashtag
fa4-**hdd-o** | HDD
fa4-**header** | header
fa4-**headphones** | headphones
fa4-**heart** | Heart
fa4-**heart-o** | Heart Outlined
fa4-**heartbeat** | Heartbeat
fa4-**history** | History
fa4-**home** | home
fa4-**hospital-o** | hospital Outlined
fa4-**hourglass** | Hourglass
fa4-**hourglass-end** | Hourglass End
fa4-**hourglass-half** | Hourglass Half
fa4-**hourglass-o** | Hourglass Outlined
fa4-**hourglass-start** | Hourglass Start
fa4-**houzz** | Houzz
fa4-**html5** | HTML 5 Logo
fa4-**i-cursor** | I Beam Cursor
fa4-**id-badge** | Identification Badge
fa4-**id-card** | Identification Card
fa4-**id-card-o** | Identification Card Outlined
fa4-**ils** | Shekel (ILS)
fa4-**imdb** | IMDB
fa4-**inbox** | inbox
fa4-**indent** | Indent
fa4-**industry** | Industry
fa4-**info** | Info
fa4-**info-circle** | Info Circle
fa4-**inr** | Indian Rupee (INR)
fa4-**instagram** | Instagram
fa4-**internet-explorer** | Internet-explorer
fa4-**ioxhost** | ioxhost
fa4-**italic** | italic
fa4-**joomla** | Joomla Logo
fa4-**jpy** | Japanese Yen (JPY)
fa4-**jsfiddle** | jsFiddle
fa4-**key** | key
fa4-**keyboard-o** | Keyboard Outlined
fa4-**krw** | Korean Won (KRW)
fa4-**language** | Language
fa4-**laptop** | Laptop
fa4-**lastfm** | last.fm
fa4-**lastfm-square** | last.fm Square
fa4-**leaf** | leaf
fa4-**leanpub** | Leanpub
fa4-**lemon-o** | Lemon Outlined
fa4-**level-down** | Level Down
fa4-**level-up** | Level Up
fa4-**life-ring** | Life Ring
fa4-**lightbulb-o** | Lightbulb Outlined
fa4-**line-chart** | Line Chart
fa4-**link** | Link
fa4-**linkedin** | LinkedIn
fa4-**linkedin-square** | LinkedIn Square
fa4-**linode** | Linode
fa4-**linux** | Linux
fa4-**list** | list
fa4-**list-alt** | list-alt
fa4-**list-ol** | list-ol
fa4-**list-ul** | list-ul
fa4-**location-arrow** | location-arrow
fa4-**lock** | lock
fa4-**long-arrow-down** | Long Arrow Down
fa4-**long-arrow-left** | Long Arrow Left
fa4-**long-arrow-right** | Long Arrow Right
fa4-**long-arrow-up** | Long Arrow Up
fa4-**low-vision** | Low Vision
fa4-**magic** | magic
fa4-**magnet** | magnet
fa4-**male** | Male
fa4-**map** | Map
fa4-**map-marker** | map-marker
fa4-**map-o** | Map Outlined
fa4-**map-pin** | Map Pin
fa4-**map-signs** | Map Signs
fa4-**mars** | Mars
fa4-**mars-double** | Mars Double
fa4-**mars-stroke** | Mars Stroke
fa4-**mars-stroke-h** | Mars Stroke Horizontal
fa4-**mars-stroke-v** | Mars Stroke Vertical
fa4-**maxcdn** | MaxCDN
fa4-**meanpath** | meanpath
fa4-**medium** | Medium
fa4-**medkit** | medkit
fa4-**meetup** | Meetup
fa4-**meh-o** | Meh Outlined
fa4-**mercury** | Mercury
fa4-**microchip** | Microchip
fa4-**microphone** | microphone
fa4-**microphone-slash** | Microphone Slash
fa4-**minus** | minus
fa4-**minus-circle** | Minus Circle
fa4-**minus-square** | Minus Square
fa4-**minus-square-o** | Minus Square Outlined
fa4-**mixcloud** | Mixcloud
fa4-**mobile** | Mobile Phone
fa4-**modx** | MODX
fa4-**money** | Money
fa4-**moon-o** | Moon Outlined
fa4-**motorcycle** | Motorcycle
fa4-**mouse-pointer** | Mouse Pointer
fa4-**music** | Music
fa4-**neuter** | Neuter
fa4-**newspaper-o** | Newspaper Outlined
fa4-**object-group** | Object Group
fa4-**object-ungroup** | Object Ungroup
fa4-**odnoklassniki** | Odnoklassniki
fa4-**odnoklassniki-square** | Odnoklassniki Square
fa4-**opencart** | OpenCart
fa4-**openid** | OpenID
fa4-**opera** | Opera
fa4-**optin-monster** | Optin Monster
fa4-**outdent** | Outdent
fa4-**pagelines** | Pagelines
fa4-**paint-brush** | Paint Brush
fa4-**paper-plane** | Paper Plane
fa4-**paper-plane-o** | Paper Plane Outlined
fa4-**paperclip** | Paperclip
fa4-**paragraph** | paragraph
fa4-**pause** | pause
fa4-**pause-circle** | Pause Circle
fa4-**pause-circle-o** | Pause Circle Outlined
fa4-**paw** | Paw
fa4-**paypal** | Paypal
fa4-**pencil** | pencil
fa4-**pencil-square** | Pencil Square
fa4-**pencil-square-o** | Pencil Square Outlined
fa4-**percent** | Percent
fa4-**phone** | Phone
fa4-**phone-square** | Phone Square
fa4-**picture-o** | Picture Outlined
fa4-**pie-chart** | Pie Chart
fa4-**pied-piper** | Pied Piper Logo
fa4-**pied-piper-alt** | Pied Piper Alternate Logo
fa4-**pied-piper-pp** | Pied Piper PP Logo (Old)
fa4-**pinterest** | Pinterest
fa4-**pinterest-p** | Pinterest P
fa4-**pinterest-square** | Pinterest Square
fa4-**plane** | plane
fa4-**play** | play
fa4-**play-circle** | Play Circle
fa4-**play-circle-o** | Play Circle Outlined
fa4-**plug** | Plug
fa4-**plus** | plus
fa4-**plus-circle** | Plus Circle
fa4-**plus-square** | Plus Square
fa4-**plus-square-o** | Plus Square Outlined
fa4-**podcast** | Podcast
fa4-**power-off** | Power Off
fa4-**print** | print
fa4-**product-hunt** | Product Hunt
fa4-**puzzle-piece** | Puzzle Piece
fa4-**qq** | QQ
fa4-**qrcode** | qrcode
fa4-**question** | Question
fa4-**question-circle** | Question Circle
fa4-**question-circle-o** | Question Circle Outlined
fa4-**quora** | Quora
fa4-**quote-left** | quote-left
fa4-**quote-right** | quote-right
fa4-**random** | random
fa4-**ravelry** | Ravelry
fa4-**rebel** | Rebel Alliance
fa4-**recycle** | Recycle
fa4-**reddit** | reddit Logo
fa4-**reddit-alien** | reddit Alien
fa4-**reddit-square** | reddit Square
fa4-**refresh** | refresh
fa4-**registered** | Registered Trademark
fa4-**renren** | Renren
fa4-**repeat** | Repeat
fa4-**reply** | Reply
fa4-**reply-all** | reply-all
fa4-**retweet** | retweet
fa4-**road** | road
fa4-**rocket** | rocket
fa4-**rss** | rss
fa4-**rss-square** | RSS Square
fa4-**rub** | Russian Ruble (RUB)
fa4-**safari** | Safari
fa4-**scissors** | Scissors
fa4-**scribd** | Scribd
fa4-**search** | Search
fa4-**search-minus** | Search Minus
fa4-**search-plus** | Search Plus
fa4-**sellsy** | Sellsy
fa4-**server** | Server
fa4-**share** | Share
fa4-**share-alt** | Share Alt
fa4-**share-alt-square** | Share Alt Square
fa4-**share-square** | Share Square
fa4-**share-square-o** | Share Square Outlined
fa4-**shield** | shield
fa4-**ship** | Ship
fa4-**shirtsinbulk** | Shirts in Bulk
fa4-**shopping-bag** | Shopping Bag
fa4-**shopping-basket** | Shopping Basket
fa4-**shopping-cart** | shopping-cart
fa4-**shower** | Shower
fa4-**sign-in** | Sign In
fa4-**sign-language** | Sign Language
fa4-**sign-out** | Sign Out
fa4-**signal** | signal
fa4-**simplybuilt** | SimplyBuilt
fa4-**sitemap** | Sitemap
fa4-**skyatlas** | skyatlas
fa4-**skype** | Skype
fa4-**slack** | Slack Logo
fa4-**sliders** | Sliders
fa4-**slideshare** | Slideshare
fa4-**smile-o** | Smile Outlined
fa4-**snapchat** | Snapchat
fa4-**snapchat-ghost** | Snapchat Ghost
fa4-**snapchat-square** | Snapchat Square
fa4-**snowflake-o** | Snowflake Outlined
fa4-**sort** | Sort
fa4-**sort-alpha-asc** | Sort Alpha Ascending
fa4-**sort-alpha-desc** | Sort Alpha Descending
fa4-**sort-amount-asc** | Sort Amount Ascending
fa4-**sort-amount-desc** | Sort Amount Descending
fa4-**sort-asc** | Sort Ascending
fa4-**sort-desc** | Sort Descending
fa4-**sort-numeric-asc** | Sort Numeric Ascending
fa4-**sort-numeric-desc** | Sort Numeric Descending
fa4-**soundcloud** | SoundCloud
fa4-**space-shuttle** | Space Shuttle
fa4-**spinner** | Spinner
fa4-**spoon** | spoon
fa4-**spotify** | Spotify
fa4-**square** | Square
fa4-**square-o** | Square Outlined
fa4-**stack-exchange** | Stack Exchange
fa4-**stack-overflow** | Stack Overflow
fa4-**star** | Star
fa4-**star-half** | star-half
fa4-**star-half-o** | Star Half Outlined
fa4-**star-o** | Star Outlined
fa4-**steam** | Steam
fa4-**steam-square** | Steam Square
fa4-**step-backward** | step-backward
fa4-**step-forward** | step-forward
fa4-**stethoscope** | Stethoscope
fa4-**sticky-note** | Sticky Note
fa4-**sticky-note-o** | Sticky Note Outlined
fa4-**stop** | stop
fa4-**stop-circle** | Stop Circle
fa4-**stop-circle-o** | Stop Circle Outlined
fa4-**street-view** | Street View
fa4-**strikethrough** | Strikethrough
fa4-**stumbleupon** | StumbleUpon Logo
fa4-**stumbleupon-circle** | StumbleUpon Circle
fa4-**subscript** | subscript
fa4-**subway** | Subway
fa4-**suitcase** | Suitcase
fa4-**sun-o** | Sun Outlined
fa4-**superpowers** | Superpowers
fa4-**superscript** | superscript
fa4-**table** | table
fa4-**tablet** | tablet
fa4-**tachometer** | Tachometer
fa4-**tag** | tag
fa4-**tags** | tags
fa4-**tasks** | Tasks
fa4-**taxi** | Taxi
fa4-**telegram** | Telegram
fa4-**television** | Television
fa4-**tencent-weibo** | Tencent Weibo
fa4-**terminal** | Terminal
fa4-**text-height** | text-height
fa4-**text-width** | text-width
fa4-**th** | th
fa4-**th-large** | th-large
fa4-**th-list** | th-list
fa4-**themeisle** | ThemeIsle
fa4-**thermometer-empty** | Thermometer Empty
fa4-**thermometer-full** | Thermometer Full
fa4-**thermometer-half** | Thermometer 1/2 Full
fa4-**thermometer-quarter** | Thermometer 1/4 Full
fa4-**thermometer-three-quarters** | Thermometer 3/4 Full
fa4-**thumb-tack** | Thumb Tack
fa4-**thumbs-down** | thumbs-down
fa4-**thumbs-o-down** | Thumbs Down Outlined
fa4-**thumbs-o-up** | Thumbs Up Outlined
fa4-**thumbs-up** | thumbs-up
fa4-**ticket** | Ticket
fa4-**times** | Times
fa4-**times-circle** | Times Circle
fa4-**times-circle-o** | Times Circle Outlined
fa4-**tint** | tint
fa4-**toggle-off** | Toggle Off
fa4-**toggle-on** | Toggle On
fa4-**trademark** | Trademark
fa4-**train** | Train
fa4-**transgender** | Transgender
fa4-**transgender-alt** | Transgender Alt
fa4-**trash** | Trash
fa4-**trash-o** | Trash Outlined
fa4-**tree** | Tree
fa4-**trello** | Trello
fa4-**tripadvisor** | TripAdvisor
fa4-**trophy** | trophy
fa4-**truck** | truck
fa4-**try** | Turkish Lira (TRY)
fa4-**tty** | TTY
fa4-**tumblr** | Tumblr
fa4-**tumblr-square** | Tumblr Square
fa4-**twitch** | Twitch
fa4-**twitter** | Twitter
fa4-**twitter-square** | Twitter Square
fa4-**umbrella** | Umbrella
fa4-**underline** | Underline
fa4-**undo** | Undo
fa4-**universal-access** | Universal Access
fa4-**university** | University
fa4-**unlock** | unlock
fa4-**unlock-alt** | Unlock Alt
fa4-**upload** | Upload
fa4-**usb** | USB
fa4-**usd** | US Dollar
fa4-**user** | User
fa4-**user-circle** | User Circle
fa4-**user-circle-o** | User Circle Outlined
fa4-**user-md** | user-md
fa4-**user-o** | User Outlined
fa4-**user-plus** | Add User
fa4-**user-secret** | User Secret
fa4-**user-times** | Remove User
fa4-**users** | Users
fa4-**venus** | Venus
fa4-**venus-double** | Venus Double
fa4-**venus-mars** | Venus Mars
fa4-**viacoin** | Viacoin
fa4-**viadeo** | Viadeo
fa4-**viadeo-square** | Viadeo Square
fa4-**video-camera** | Video Camera
fa4-**vimeo** | Vimeo
fa4-**vimeo-square** | Vimeo Square
fa4-**vine** | Vine
fa4-**vk** | VK
fa4-**volume-control-phone** | Volume Control Phone
fa4-**volume-down** | volume-down
fa4-**volume-off** | volume-off
fa4-**volume-up** | volume-up
fa4-**weibo** | Weibo
fa4-**weixin** | Weixin (WeChat)
fa4-**whatsapp** | What's App
fa4-**wheelchair** | Wheelchair
fa4-**wheelchair-alt** | Wheelchair Alt
fa4-**wifi** | WiFi
fa4-**wikipedia-w** | Wikipedia W
fa4-**window-close** | Window Close
fa4-**window-close-o** | Window Close Outline
fa4-**window-maximize** | Window Maximize
fa4-**window-minimize** | Window Minimize
fa4-**window-restore** | Window Restore
fa4-**windows** | Windows
fa4-**wordpress** | WordPress Logo
fa4-**wpbeginner** | WPBeginner
fa4-**wpexplorer** | WPExplorer
fa4-**wpforms** | WPForms
fa4-**wrench** | Wrench
fa4-**xing** | Xing
fa4-**xing-square** | Xing Square
fa4-**y-combinator** | Y Combinator
fa4-**yahoo** | Yahoo Logo
fa4-**yelp** | Yelp
fa4-**yoast** | Yoast
fa4-**youtube** | YouTube
fa4-**youtube-play** | YouTube Play
fa4-**youtube-square** | YouTube Square


### Font Awesome 5 Free icon snippets

Trigger | Description
--- | ---
fa5-**$-js** | Font Awesome 5 Free JS link
fa5-**$-css** | Font Awesome 5 Free CSS link
fa5-**500px** | 500px
fa5-**accessible-icon** | Accessible Icon
fa5-**accusoft** | Accusoft
fa5-**acquisitions-incorporated** | Acquisitions Incorporated
fa5-**ad** | Ad
fa5-**address-book** | Address Book
fa5-**address-card** | Address Card
fa5-**adjust** | adjust
fa5-**adn** | App.net
fa5-**adversal** | Adversal
fa5-**affiliatetheme** | affiliatetheme
fa5-**air-freshener** | Air Freshener
fa5-**algolia** | Algolia
fa5-**align-center** | align-center
fa5-**align-justify** | align-justify
fa5-**align-left** | align-left
fa5-**align-right** | align-right
fa5-**alipay** | Alipay
fa5-**allergies** | Allergies
fa5-**amazon** | Amazon
fa5-**amazon-pay** | Amazon Pay
fa5-**ambulance** | ambulance
fa5-**american-sign-language-interpreting** | American Sign Language Interpreting
fa5-**amilia** | Amilia
fa5-**anchor** | Anchor
fa5-**android** | Android
fa5-**angellist** | AngelList
fa5-**angle-double-down** | Angle Double Down
fa5-**angle-double-left** | Angle Double Left
fa5-**angle-double-right** | Angle Double Right
fa5-**angle-double-up** | Angle Double Up
fa5-**angle-down** | angle-down
fa5-**angle-left** | angle-left
fa5-**angle-right** | angle-right
fa5-**angle-up** | angle-up
fa5-**angry** | Angry Face
fa5-**angrycreative** | Angry Creative
fa5-**angular** | Angular
fa5-**ankh** | Ankh
fa5-**app-store** | App Store
fa5-**app-store-ios** | iOS App Store
fa5-**apper** | Apper Systems AB
fa5-**apple** | Apple
fa5-**apple-alt** | Fruit Apple
fa5-**apple-pay** | Apple Pay
fa5-**archive** | Archive
fa5-**archway** | Archway
fa5-**arrow-alt-circle-down** | Alternate Arrow Circle Down
fa5-**arrow-alt-circle-left** | Alternate Arrow Circle Left
fa5-**arrow-alt-circle-right** | Alternate Arrow Circle Right
fa5-**arrow-alt-circle-up** | Alternate Arrow Circle Up
fa5-**arrow-circle-down** | Arrow Circle Down
fa5-**arrow-circle-left** | Arrow Circle Left
fa5-**arrow-circle-right** | Arrow Circle Right
fa5-**arrow-circle-up** | Arrow Circle Up
fa5-**arrow-down** | arrow-down
fa5-**arrow-left** | arrow-left
fa5-**arrow-right** | arrow-right
fa5-**arrow-up** | arrow-up
fa5-**arrows-alt** | Alternate Arrows
fa5-**arrows-alt-h** | Alternate Arrows Horizontal
fa5-**arrows-alt-v** | Alternate Arrows Vertical
fa5-**assistive-listening-systems** | Assistive Listening Systems
fa5-**asterisk** | asterisk
fa5-**asymmetrik** | Asymmetrik, Ltd.
fa5-**at** | At
fa5-**atlas** | Atlas
fa5-**atom** | Atom
fa5-**audible** | Audible
fa5-**audio-description** | Audio Description
fa5-**autoprefixer** | Autoprefixer
fa5-**avianex** | avianex
fa5-**aviato** | Aviato
fa5-**award** | Award
fa5-**aws** | Amazon Web Services (AWS)
fa5-**backspace** | Backspace
fa5-**backward** | backward
fa5-**balance-scale** | Balance Scale
fa5-**ban** | ban
fa5-**band-aid** | Band-Aid
fa5-**bandcamp** | Bandcamp
fa5-**barcode** | barcode
fa5-**bars** | Bars
fa5-**baseball-ball** | Baseball Ball
fa5-**basketball-ball** | Basketball Ball
fa5-**bath** | Bath
fa5-**battery-empty** | Battery Empty
fa5-**battery-full** | Battery Full
fa5-**battery-half** | Battery 1/2 Full
fa5-**battery-quarter** | Battery 1/4 Full
fa5-**battery-three-quarters** | Battery 3/4 Full
fa5-**bed** | Bed
fa5-**beer** | beer
fa5-**behance** | Behance
fa5-**behance-square** | Behance Square
fa5-**bell** | bell
fa5-**bell-slash** | Bell Slash
fa5-**bezier-curve** | Bezier Curve
fa5-**bible** | Bible
fa5-**bicycle** | Bicycle
fa5-**bimobject** | BIMobject
fa5-**binoculars** | Binoculars
fa5-**birthday-cake** | Birthday Cake
fa5-**bitbucket** | Bitbucket
fa5-**bitcoin** | Bitcoin
fa5-**bity** | Bity
fa5-**black-tie** | Font Awesome Black Tie
fa5-**blackberry** | BlackBerry
fa5-**blender** | Blender
fa5-**blender-phone** | Blender Phone
fa5-**blind** | Blind
fa5-**blogger** | Blogger
fa5-**blogger-b** | Blogger B
fa5-**bluetooth** | Bluetooth
fa5-**bluetooth-b** | Bluetooth
fa5-**bold** | bold
fa5-**bolt** | Lightning Bolt
fa5-**bomb** | Bomb
fa5-**bone** | Bone
fa5-**bong** | Bong
fa5-**book** | book
fa5-**book-dead** | Book of the Dead
fa5-**book-open** | Book Open
fa5-**book-reader** | Book Reader
fa5-**bookmark** | bookmark
fa5-**bowling-ball** | Bowling Ball
fa5-**box** | Box
fa5-**box-open** | Box Open
fa5-**boxes** | Boxes
fa5-**braille** | Braille
fa5-**brain** | Brain
fa5-**briefcase** | Briefcase
fa5-**briefcase-medical** | Medical Briefcase
fa5-**broadcast-tower** | Broadcast Tower
fa5-**broom** | Broom
fa5-**brush** | Brush
fa5-**btc** | BTC
fa5-**bug** | Bug
fa5-**building** | Building
fa5-**bullhorn** | bullhorn
fa5-**bullseye** | Bullseye
fa5-**burn** | Burn
fa5-**buromobelexperte** | Büromöbel-Experte GmbH & Co. KG.
fa5-**bus** | Bus
fa5-**bus-alt** | Bus Alt
fa5-**business-time** | Business Time
fa5-**buysellads** | BuySellAds
fa5-**calculator** | Calculator
fa5-**calendar** | Calendar
fa5-**calendar-alt** | Alternate Calendar
fa5-**calendar-check** | Calendar Check
fa5-**calendar-minus** | Calendar Minus
fa5-**calendar-plus** | Calendar Plus
fa5-**calendar-times** | Calendar Times
fa5-**camera** | camera
fa5-**camera-retro** | Retro Camera
fa5-**campground** | Campground
fa5-**cannabis** | Cannabis
fa5-**capsules** | Capsules
fa5-**car** | Car
fa5-**car-alt** | Alternate Car
fa5-**car-battery** | Car Battery
fa5-**car-crash** | Car Crash
fa5-**car-side** | Car Side
fa5-**caret-down** | Caret Down
fa5-**caret-left** | Caret Left
fa5-**caret-right** | Caret Right
fa5-**caret-square-down** | Caret Square Down
fa5-**caret-square-left** | Caret Square Left
fa5-**caret-square-right** | Caret Square Right
fa5-**caret-square-up** | Caret Square Up
fa5-**caret-up** | Caret Up
fa5-**cart-arrow-down** | Shopping Cart Arrow Down
fa5-**cart-plus** | Add to Shopping Cart
fa5-**cat** | Cat
fa5-**cc-amazon-pay** | Amazon Pay Credit Card
fa5-**cc-amex** | American Express Credit Card
fa5-**cc-apple-pay** | Apple Pay Credit Card
fa5-**cc-diners-club** | Diner's Club Credit Card
fa5-**cc-discover** | Discover Credit Card
fa5-**cc-jcb** | JCB Credit Card
fa5-**cc-mastercard** | MasterCard Credit Card
fa5-**cc-paypal** | Paypal Credit Card
fa5-**cc-stripe** | Stripe Credit Card
fa5-**cc-visa** | Visa Credit Card
fa5-**centercode** | Centercode
fa5-**certificate** | certificate
fa5-**chair** | Chair
fa5-**chalkboard** | Chalkboard
fa5-**chalkboard-teacher** | Chalkboard Teacher
fa5-**charging-station** | Charging Station
fa5-**chart-area** | Area Chart
fa5-**chart-bar** | Bar Chart
fa5-**chart-line** | Line Chart
fa5-**chart-pie** | Pie Chart
fa5-**check** | Check
fa5-**check-circle** | Check Circle
fa5-**check-double** | Check Double
fa5-**check-square** | Check Square
fa5-**chess** | Chess
fa5-**chess-bishop** | Chess Bishop
fa5-**chess-board** | Chess Board
fa5-**chess-king** | Chess King
fa5-**chess-knight** | Chess Knight
fa5-**chess-pawn** | Chess Pawn
fa5-**chess-queen** | Chess Queen
fa5-**chess-rook** | Chess Rook
fa5-**chevron-circle-down** | Chevron Circle Down
fa5-**chevron-circle-left** | Chevron Circle Left
fa5-**chevron-circle-right** | Chevron Circle Right
fa5-**chevron-circle-up** | Chevron Circle Up
fa5-**chevron-down** | chevron-down
fa5-**chevron-left** | chevron-left
fa5-**chevron-right** | chevron-right
fa5-**chevron-up** | chevron-up
fa5-**child** | Child
fa5-**chrome** | Chrome
fa5-**church** | Church
fa5-**circle** | Circle
fa5-**circle-notch** | Circle Notched
fa5-**city** | City
fa5-**clipboard** | Clipboard
fa5-**clipboard-check** | Clipboard with Check
fa5-**clipboard-list** | Clipboard List
fa5-**clock** | Clock
fa5-**clone** | Clone
fa5-**closed-captioning** | Closed Captioning
fa5-**cloud** | Cloud
fa5-**cloud-download-alt** | Alternate Cloud Download
fa5-**cloud-meatball** | Cloud with (a chance of) Meatball
fa5-**cloud-moon** | Cloud with Moon
fa5-**cloud-moon-rain** | Cloud with Moon and Rain
fa5-**cloud-rain** | Cloud with Rain
fa5-**cloud-showers-heavy** | Cloud with Heavy Showers
fa5-**cloud-sun** | Cloud with Sun
fa5-**cloud-sun-rain** | Cloud with Sun and Rain
fa5-**cloud-upload-alt** | Alternate Cloud Upload
fa5-**cloudscale** | cloudscale.ch
fa5-**cloudsmith** | Cloudsmith
fa5-**cloudversify** | cloudversify
fa5-**cocktail** | Cocktail
fa5-**code** | Code
fa5-**code-branch** | Code Branch
fa5-**codepen** | Codepen
fa5-**codiepie** | Codie Pie
fa5-**coffee** | Coffee
fa5-**cog** | cog
fa5-**cogs** | cogs
fa5-**coins** | Coins
fa5-**columns** | Columns
fa5-**comment** | comment
fa5-**comment-alt** | Alternate Comment
fa5-**comment-dollar** | Comment Dollar
fa5-**comment-dots** | Comment Dots
fa5-**comment-slash** | Comment Slash
fa5-**comments** | comments
fa5-**comments-dollar** | Comments Dollar
fa5-**compact-disc** | Compact Disc
fa5-**compass** | Compass
fa5-**compress** | Compress
fa5-**concierge-bell** | Concierge Bell
fa5-**connectdevelop** | Connect Develop
fa5-**contao** | Contao
fa5-**cookie** | Cookie
fa5-**cookie-bite** | Cookie Bite
fa5-**copy** | Copy
fa5-**copyright** | Copyright
fa5-**couch** | Couch
fa5-**cpanel** | cPanel
fa5-**creative-commons** | Creative Commons
fa5-**creative-commons-by** | Creative Commons Attribution
fa5-**creative-commons-nc** | Creative Commons Noncommercial
fa5-**creative-commons-nc-eu** | Creative Commons Noncommercial (Euro Sign)
fa5-**creative-commons-nc-jp** | Creative Commons Noncommercial (Yen Sign)
fa5-**creative-commons-nd** | Creative Commons No Derivative Works
fa5-**creative-commons-pd** | Creative Commons Public Domain
fa5-**creative-commons-pd-alt** | Creative Commons Public Domain Alternate
fa5-**creative-commons-remix** | Creative Commons Remix
fa5-**creative-commons-sa** | Creative Commons Share Alike
fa5-**creative-commons-sampling** | Creative Commons Sampling
fa5-**creative-commons-sampling-plus** | Creative Commons Sampling +
fa5-**creative-commons-share** | Creative Commons Share
fa5-**creative-commons-zero** | Creative Commons CC0
fa5-**credit-card** | Credit Card
fa5-**critical-role** | Critical Role
fa5-**crop** | crop
fa5-**crop-alt** | Alternate Crop
fa5-**cross** | Cross
fa5-**crosshairs** | Crosshairs
fa5-**crow** | Crow
fa5-**crown** | Crown
fa5-**css3** | CSS 3 Logo
fa5-**css3-alt** | Alternate CSS3 Logo
fa5-**cube** | Cube
fa5-**cubes** | Cubes
fa5-**cut** | Cut
fa5-**cuttlefish** | Cuttlefish
fa5-**d-and-d** | Dungeons & Dragons
fa5-**d-and-d-beyond** | D&D Beyond
fa5-**dashcube** | DashCube
fa5-**database** | Database
fa5-**deaf** | Deaf
fa5-**delicious** | Delicious Logo
fa5-**democrat** | Democrat
fa5-**deploydog** | deploy.dog
fa5-**deskpro** | Deskpro
fa5-**desktop** | Desktop
fa5-**dev** | DEV
fa5-**deviantart** | deviantART
fa5-**dharmachakra** | Dharmachakra
fa5-**diagnoses** | Diagnoses
fa5-**dice** | Dice
fa5-**dice-d20** | Dice D20
fa5-**dice-d6** | Dice D6
fa5-**dice-five** | Dice Five
fa5-**dice-four** | Dice Four
fa5-**dice-one** | Dice One
fa5-**dice-six** | Dice Six
fa5-**dice-three** | Dice Three
fa5-**dice-two** | Dice Two
fa5-**digg** | Digg Logo
fa5-**digital-ocean** | Digital Ocean
fa5-**digital-tachograph** | Digital Tachograph
fa5-**directions** | Directions
fa5-**discord** | Discord
fa5-**discourse** | Discourse
fa5-**divide** | Divide
fa5-**dizzy** | Dizzy Face
fa5-**dna** | DNA
fa5-**dochub** | DocHub
fa5-**docker** | Docker
fa5-**dog** | Dog
fa5-**dollar-sign** | Dollar Sign
fa5-**dolly** | Dolly
fa5-**dolly-flatbed** | Dolly Flatbed
fa5-**donate** | Donate
fa5-**door-closed** | Door Closed
fa5-**door-open** | Door Open
fa5-**dot-circle** | Dot Circle
fa5-**dove** | Dove
fa5-**download** | Download
fa5-**draft2digital** | Draft2digital
fa5-**drafting-compass** | Drafting Compass
fa5-**dragon** | Dragon
fa5-**draw-polygon** | Draw Polygon
fa5-**dribbble** | Dribbble
fa5-**dribbble-square** | Dribbble Square
fa5-**dropbox** | Dropbox
fa5-**drum** | Drum
fa5-**drum-steelpan** | Drum Steelpan
fa5-**drumstick-bite** | Drumstick with Bite Taken Out
fa5-**drupal** | Drupal Logo
fa5-**dumbbell** | Dumbbell
fa5-**dungeon** | Dungeon
fa5-**dyalog** | Dyalog
fa5-**earlybirds** | Earlybirds
fa5-**ebay** | eBay
fa5-**edge** | Edge Browser
fa5-**edit** | Edit
fa5-**eject** | eject
fa5-**elementor** | Elementor
fa5-**ellipsis-h** | Horizontal Ellipsis
fa5-**ellipsis-v** | Vertical Ellipsis
fa5-**ello** | Ello
fa5-**ember** | Ember
fa5-**empire** | Galactic Empire
fa5-**envelope** | Envelope
fa5-**envelope-open** | Envelope Open
fa5-**envelope-open-text** | Envelope Open-text
fa5-**envelope-square** | Envelope Square
fa5-**envira** | Envira Gallery
fa5-**equals** | Equals
fa5-**eraser** | eraser
fa5-**erlang** | Erlang
fa5-**ethereum** | Ethereum
fa5-**etsy** | Etsy
fa5-**euro-sign** | Euro Sign
fa5-**exchange-alt** | Alternate Exchange
fa5-**exclamation** | exclamation
fa5-**exclamation-circle** | Exclamation Circle
fa5-**exclamation-triangle** | Exclamation Triangle
fa5-**expand** | Expand
fa5-**expand-arrows-alt** | Alternate Expand Arrows
fa5-**expeditedssl** | ExpeditedSSL
fa5-**external-link-alt** | Alternate External Link
fa5-**external-link-square-alt** | Alternate External Link Square
fa5-**eye** | Eye
fa5-**eye-dropper** | Eye Dropper
fa5-**eye-slash** | Eye Slash
fa5-**facebook** | Facebook
fa5-**facebook-f** | Facebook F
fa5-**facebook-messenger** | Facebook Messenger
fa5-**facebook-square** | Facebook Square
fa5-**fantasy-flight-games** | Fantasy Flight-games
fa5-**fast-backward** | fast-backward
fa5-**fast-forward** | fast-forward
fa5-**fax** | Fax
fa5-**feather** | Feather
fa5-**feather-alt** | Alternate Feather
fa5-**female** | Female
fa5-**fighter-jet** | fighter-jet
fa5-**file** | File
fa5-**file-alt** | Alternate File
fa5-**file-archive** | Archive File
fa5-**file-audio** | Audio File
fa5-**file-code** | Code File
fa5-**file-contract** | File Contract
fa5-**file-csv** | File CSV
fa5-**file-download** | File Download
fa5-**file-excel** | Excel File
fa5-**file-export** | File Export
fa5-**file-image** | Image File
fa5-**file-import** | File Import
fa5-**file-invoice** | File Invoice
fa5-**file-invoice-dollar** | File Invoice with US Dollar
fa5-**file-medical** | Medical File
fa5-**file-medical-alt** | Alternate Medical File
fa5-**file-pdf** | PDF File
fa5-**file-powerpoint** | Powerpoint File
fa5-**file-prescription** | File Prescription
fa5-**file-signature** | File Signature
fa5-**file-upload** | File Upload
fa5-**file-video** | Video File
fa5-**file-word** | Word File
fa5-**fill** | Fill
fa5-**fill-drip** | Fill Drip
fa5-**film** | Film
fa5-**filter** | Filter
fa5-**fingerprint** | Fingerprint
fa5-**fire** | fire
fa5-**fire-extinguisher** | fire-extinguisher
fa5-**firefox** | Firefox
fa5-**first-aid** | First Aid
fa5-**first-order** | First Order
fa5-**first-order-alt** | Alternate First Order
fa5-**firstdraft** | firstdraft
fa5-**fish** | Fish
fa5-**fist-raised** | Raised Fist
fa5-**flag** | flag
fa5-**flag-checkered** | flag-checkered
fa5-**flag-usa** | United States of America Flag
fa5-**flask** | Flask
fa5-**flickr** | Flickr
fa5-**flipboard** | Flipboard
fa5-**flushed** | Flushed Face
fa5-**fly** | Fly
fa5-**folder** | Folder
fa5-**folder-minus** | Folder Minus
fa5-**folder-open** | Folder Open
fa5-**folder-plus** | Folder Plus
fa5-**font** | font
fa5-**font-awesome** | Font Awesome
fa5-**font-awesome-alt** | Alternate Font Awesome
fa5-**font-awesome-flag** | Font Awesome Flag
fa5-**font-awesome-logo-full** | Font Awesome Full Logo
fa5-**fonticons** | Fonticons
fa5-**fonticons-fi** | Fonticons Fi
fa5-**football-ball** | Football Ball
fa5-**fort-awesome** | Fort Awesome
fa5-**fort-awesome-alt** | Alternate Fort Awesome
fa5-**forumbee** | Forumbee
fa5-**forward** | forward
fa5-**foursquare** | Foursquare
fa5-**free-code-camp** | Free Code Camp
fa5-**freebsd** | FreeBSD
fa5-**frog** | Frog
fa5-**frown** | Frowning Face
fa5-**frown-open** | Frowning Face With Open Mouth
fa5-**fulcrum** | Fulcrum
fa5-**funnel-dollar** | Funnel Dollar
fa5-**futbol** | Futbol
fa5-**galactic-republic** | Galactic Republic
fa5-**galactic-senate** | Galactic Senate
fa5-**gamepad** | Gamepad
fa5-**gas-pump** | Gas Pump
fa5-**gavel** | Gavel
fa5-**gem** | Gem
fa5-**genderless** | Genderless
fa5-**get-pocket** | Get Pocket
fa5-**gg** | GG Currency
fa5-**gg-circle** | GG Currency Circle
fa5-**ghost** | Ghost
fa5-**gift** | gift
fa5-**git** | Git
fa5-**git-square** | Git Square
fa5-**github** | GitHub
fa5-**github-alt** | Alternate GitHub
fa5-**github-square** | GitHub Square
fa5-**gitkraken** | GitKraken
fa5-**gitlab** | GitLab
fa5-**gitter** | Gitter
fa5-**glass-martini** | Martini Glass
fa5-**glass-martini-alt** | Alternate Glass Martini
fa5-**glasses** | Glasses
fa5-**glide** | Glide
fa5-**glide-g** | Glide G
fa5-**globe** | Globe
fa5-**globe-africa** | Globe with Africa shown
fa5-**globe-americas** | Globe with Americas shown
fa5-**globe-asia** | Globe with Asia shown
fa5-**gofore** | Gofore
fa5-**golf-ball** | Golf Ball
fa5-**goodreads** | Goodreads
fa5-**goodreads-g** | Goodreads G
fa5-**google** | Google Logo
fa5-**google-drive** | Google Drive
fa5-**google-play** | Google Play
fa5-**google-plus** | Google Plus
fa5-**google-plus-g** | Google Plus G
fa5-**google-plus-square** | Google Plus Square
fa5-**google-wallet** | Google Wallet
fa5-**gopuram** | Gopuram
fa5-**graduation-cap** | Graduation Cap
fa5-**gratipay** | Gratipay (Gittip)
fa5-**grav** | Grav
fa5-**greater-than** | Greater Than
fa5-**greater-than-equal** | Greater Than Equal To
fa5-**grimace** | Grimacing Face
fa5-**grin** | Grinning Face
fa5-**grin-alt** | Alternate Grinning Face
fa5-**grin-beam** | Grinning Face With Smiling Eyes
fa5-**grin-beam-sweat** | Grinning Face With Sweat
fa5-**grin-hearts** | Smiling Face With Heart-Eyes
fa5-**grin-squint** | Grinning Squinting Face
fa5-**grin-squint-tears** | Rolling on the Floor Laughing
fa5-**grin-stars** | Star-Struck
fa5-**grin-tears** | Face With Tears of Joy
fa5-**grin-tongue** | Face With Tongue
fa5-**grin-tongue-squint** | Squinting Face With Tongue
fa5-**grin-tongue-wink** | Winking Face With Tongue
fa5-**grin-wink** | Grinning Winking Face
fa5-**grip-horizontal** | Grip Horizontal
fa5-**grip-vertical** | Grip Vertical
fa5-**gripfire** | Gripfire, Inc.
fa5-**grunt** | Grunt
fa5-**gulp** | Gulp
fa5-**h-square** | H Square
fa5-**hacker-news** | Hacker News
fa5-**hacker-news-square** | Hacker News Square
fa5-**hackerrank** | Hackerrank
fa5-**hammer** | Hammer
fa5-**hamsa** | Hamsa
fa5-**hand-holding** | Hand Holding
fa5-**hand-holding-heart** | Hand Holding Heart
fa5-**hand-holding-usd** | Hand Holding US Dollar
fa5-**hand-lizard** | Lizard (Hand)
fa5-**hand-paper** | Paper (Hand)
fa5-**hand-peace** | Peace (Hand)
fa5-**hand-point-down** | Hand Pointing Down
fa5-**hand-point-left** | Hand Pointing Left
fa5-**hand-point-right** | Hand Pointing Right
fa5-**hand-point-up** | Hand Pointing Up
fa5-**hand-pointer** | Pointer (Hand)
fa5-**hand-rock** | Rock (Hand)
fa5-**hand-scissors** | Scissors (Hand)
fa5-**hand-spock** | Spock (Hand)
fa5-**hands** | Hands
fa5-**hands-helping** | Helping Hands
fa5-**handshake** | Handshake
fa5-**hanukiah** | Hanukiah
fa5-**hashtag** | Hashtag
fa5-**hat-wizard** | Wizard's Hat
fa5-**haykal** | Haykal
fa5-**hdd** | HDD
fa5-**heading** | heading
fa5-**headphones** | headphones
fa5-**headphones-alt** | Alternate Headphones
fa5-**headset** | Headset
fa5-**heart** | Heart
fa5-**heartbeat** | Heartbeat
fa5-**helicopter** | Helicopter
fa5-**highlighter** | Highlighter
fa5-**hiking** | Hiking
fa5-**hippo** | Hippo
fa5-**hips** | Hips
fa5-**hire-a-helper** | HireAHelper
fa5-**history** | History
fa5-**hockey-puck** | Hockey Puck
fa5-**home** | home
fa5-**hooli** | Hooli
fa5-**hornbill** | Hornbill
fa5-**horse** | Horse
fa5-**hospital** | hospital
fa5-**hospital-alt** | Alternate Hospital
fa5-**hospital-symbol** | Hospital Symbol
fa5-**hot-tub** | Hot Tub
fa5-**hotel** | Hotel
fa5-**hotjar** | Hotjar
fa5-**hourglass** | Hourglass
fa5-**hourglass-end** | Hourglass End
fa5-**hourglass-half** | Hourglass Half
fa5-**hourglass-start** | Hourglass Start
fa5-**house-damage** | Damaged House
fa5-**houzz** | Houzz
fa5-**hryvnia** | Hryvnia
fa5-**html5** | HTML 5 Logo
fa5-**hubspot** | HubSpot
fa5-**i-cursor** | I Beam Cursor
fa5-**id-badge** | Identification Badge
fa5-**id-card** | Identification Card
fa5-**id-card-alt** | Alternate Identification Card
fa5-**image** | Image
fa5-**images** | Images
fa5-**imdb** | IMDB
fa5-**inbox** | inbox
fa5-**indent** | Indent
fa5-**industry** | Industry
fa5-**infinity** | Infinity
fa5-**info** | Info
fa5-**info-circle** | Info Circle
fa5-**instagram** | Instagram
fa5-**internet-explorer** | Internet-explorer
fa5-**ioxhost** | ioxhost
fa5-**italic** | italic
fa5-**itunes** | iTunes
fa5-**itunes-note** | Itunes Note
fa5-**java** | Java
fa5-**jedi** | Jedi
fa5-**jedi-order** | Jedi Order
fa5-**jenkins** | Jenkis
fa5-**joget** | Joget
fa5-**joint** | Joint
fa5-**joomla** | Joomla Logo
fa5-**journal-whills** | Journal of the Whills
fa5-**js** | JavaScript (JS)
fa5-**js-square** | JavaScript (JS) Square
fa5-**jsfiddle** | jsFiddle
fa5-**kaaba** | Kaaba
fa5-**kaggle** | Kaggle
fa5-**key** | key
fa5-**keybase** | Keybase
fa5-**keyboard** | Keyboard
fa5-**keycdn** | KeyCDN
fa5-**khanda** | Khanda
fa5-**kickstarter** | Kickstarter
fa5-**kickstarter-k** | Kickstarter K
fa5-**kiss** | Kissing Face
fa5-**kiss-beam** | Kissing Face With Smiling Eyes
fa5-**kiss-wink-heart** | Face Blowing a Kiss
fa5-**kiwi-bird** | Kiwi Bird
fa5-**korvue** | KORVUE
fa5-**landmark** | Landmark
fa5-**language** | Language
fa5-**laptop** | Laptop
fa5-**laptop-code** | Laptop Code
fa5-**laravel** | Laravel
fa5-**lastfm** | last.fm
fa5-**lastfm-square** | last.fm Square
fa5-**laugh** | Grinning Face With Big Eyes
fa5-**laugh-beam** | Laugh Face with Beaming Eyes
fa5-**laugh-squint** | Laughing Squinting Face
fa5-**laugh-wink** | Laughing Winking Face
fa5-**layer-group** | Layer Group
fa5-**leaf** | leaf
fa5-**leanpub** | Leanpub
fa5-**lemon** | Lemon
fa5-**less** | Less
fa5-**less-than** | Less Than
fa5-**less-than-equal** | Less Than Equal To
fa5-**level-down-alt** | Alternate Level Down
fa5-**level-up-alt** | Alternate Level Up
fa5-**life-ring** | Life Ring
fa5-**lightbulb** | Lightbulb
fa5-**line** | Line
fa5-**link** | Link
fa5-**linkedin** | LinkedIn
fa5-**linkedin-in** | LinkedIn In
fa5-**linode** | Linode
fa5-**linux** | Linux
fa5-**lira-sign** | Turkish Lira Sign
fa5-**list** | List
fa5-**list-alt** | Alternate List
fa5-**list-ol** | list-ol
fa5-**list-ul** | list-ul
fa5-**location-arrow** | location-arrow
fa5-**lock** | lock
fa5-**lock-open** | Lock Open
fa5-**long-arrow-alt-down** | Alternate Long Arrow Down
fa5-**long-arrow-alt-left** | Alternate Long Arrow Left
fa5-**long-arrow-alt-right** | Alternate Long Arrow Right
fa5-**long-arrow-alt-up** | Alternate Long Arrow Up
fa5-**low-vision** | Low Vision
fa5-**luggage-cart** | Luggage Cart
fa5-**lyft** | lyft
fa5-**magento** | Magento
fa5-**magic** | magic
fa5-**magnet** | magnet
fa5-**mail-bulk** | Mail Bulk
fa5-**mailchimp** | Mailchimp
fa5-**male** | Male
fa5-**mandalorian** | Mandalorian
fa5-**map** | Map
fa5-**map-marked** | Map Marked
fa5-**map-marked-alt** | Alternate Map Marked
fa5-**map-marker** | map-marker
fa5-**map-marker-alt** | Alternate Map Marker
fa5-**map-pin** | Map Pin
fa5-**map-signs** | Map Signs
fa5-**markdown** | Markdown
fa5-**marker** | Marker
fa5-**mars** | Mars
fa5-**mars-double** | Mars Double
fa5-**mars-stroke** | Mars Stroke
fa5-**mars-stroke-h** | Mars Stroke Horizontal
fa5-**mars-stroke-v** | Mars Stroke Vertical
fa5-**mask** | Mask
fa5-**mastodon** | Mastodon
fa5-**maxcdn** | MaxCDN
fa5-**medal** | Medal
fa5-**medapps** | MedApps
fa5-**medium** | Medium
fa5-**medium-m** | Medium M
fa5-**medkit** | medkit
fa5-**medrt** | MRT
fa5-**meetup** | Meetup
fa5-**megaport** | Megaport
fa5-**meh** | Neutral Face
fa5-**meh-blank** | Face Without Mouth
fa5-**meh-rolling-eyes** | Face With Rolling Eyes
fa5-**memory** | Memory
fa5-**menorah** | Menorah
fa5-**mercury** | Mercury
fa5-**meteor** | Meteor
fa5-**microchip** | Microchip
fa5-**microphone** | microphone
fa5-**microphone-alt** | Alternate Microphone
fa5-**microphone-alt-slash** | Alternate Microphone Slash
fa5-**microphone-slash** | Microphone Slash
fa5-**microscope** | Microscope
fa5-**microsoft** | Microsoft
fa5-**minus** | minus
fa5-**minus-circle** | Minus Circle
fa5-**minus-square** | Minus Square
fa5-**mix** | Mix
fa5-**mixcloud** | Mixcloud
fa5-**mizuni** | Mizuni
fa5-**mobile** | Mobile Phone
fa5-**mobile-alt** | Alternate Mobile
fa5-**modx** | MODX
fa5-**monero** | Monero
fa5-**money-bill** | Money Bill
fa5-**money-bill-alt** | Alternate Money Bill
fa5-**money-bill-wave** | Wavy Money Bill
fa5-**money-bill-wave-alt** | Alternate Wavy Money Bill
fa5-**money-check** | Money Check
fa5-**money-check-alt** | Alternate Money Check
fa5-**monument** | Monument
fa5-**moon** | Moon
fa5-**mortar-pestle** | Mortar Pestle
fa5-**mosque** | Mosque
fa5-**motorcycle** | Motorcycle
fa5-**mountain** | Mountain
fa5-**mouse-pointer** | Mouse Pointer
fa5-**music** | Music
fa5-**napster** | Napster
fa5-**neos** | Neos
fa5-**network-wired** | Wired Network
fa5-**neuter** | Neuter
fa5-**newspaper** | Newspaper
fa5-**nimblr** | Nimblr
fa5-**nintendo-switch** | Nintendo Switch
fa5-**node** | Node.js
fa5-**node-js** | Node.js JS
fa5-**not-equal** | Not Equal
fa5-**notes-medical** | Medical Notes
fa5-**npm** | npm
fa5-**ns8** | NS8
fa5-**nutritionix** | Nutritionix
fa5-**object-group** | Object Group
fa5-**object-ungroup** | Object Ungroup
fa5-**odnoklassniki** | Odnoklassniki
fa5-**odnoklassniki-square** | Odnoklassniki Square
fa5-**oil-can** | Oil Can
fa5-**old-republic** | Old Republic
fa5-**om** | Om
fa5-**opencart** | OpenCart
fa5-**openid** | OpenID
fa5-**opera** | Opera
fa5-**optin-monster** | Optin Monster
fa5-**osi** | Open Source Initiative
fa5-**otter** | Otter
fa5-**outdent** | Outdent
fa5-**page4** | page4 Corporation
fa5-**pagelines** | Pagelines
fa5-**paint-brush** | Paint Brush
fa5-**paint-roller** | Paint Roller
fa5-**palette** | Palette
fa5-**palfed** | Palfed
fa5-**pallet** | Pallet
fa5-**paper-plane** | Paper Plane
fa5-**paperclip** | Paperclip
fa5-**parachute-box** | Parachute Box
fa5-**paragraph** | paragraph
fa5-**parking** | Parking
fa5-**passport** | Passport
fa5-**pastafarianism** | Pastafarianism
fa5-**paste** | Paste
fa5-**patreon** | Patreon
fa5-**pause** | pause
fa5-**pause-circle** | Pause Circle
fa5-**paw** | Paw
fa5-**paypal** | Paypal
fa5-**peace** | Peace
fa5-**pen** | Pen
fa5-**pen-alt** | Alternate Pen
fa5-**pen-fancy** | Pen Fancy
fa5-**pen-nib** | Pen Nib
fa5-**pen-square** | Pen Square
fa5-**pencil-alt** | Alternate Pencil
fa5-**pencil-ruler** | Pencil Ruler
fa5-**penny-arcade** | Penny Arcade
fa5-**people-carry** | People Carry
fa5-**percent** | Percent
fa5-**percentage** | Percentage
fa5-**periscope** | Periscope
fa5-**person-booth** | Person Entering Booth
fa5-**phabricator** | Phabricator
fa5-**phoenix-framework** | Phoenix Framework
fa5-**phoenix-squadron** | Phoenix Squadron
fa5-**phone** | Phone
fa5-**phone-slash** | Phone Slash
fa5-**phone-square** | Phone Square
fa5-**phone-volume** | Phone Volume
fa5-**php** | PHP
fa5-**pied-piper** | Pied Piper Logo
fa5-**pied-piper-alt** | Alternate Pied Piper Logo
fa5-**pied-piper-hat** | Pied Piper-hat
fa5-**pied-piper-pp** | Pied Piper PP Logo (Old)
fa5-**piggy-bank** | Piggy Bank
fa5-**pills** | Pills
fa5-**pinterest** | Pinterest
fa5-**pinterest-p** | Pinterest P
fa5-**pinterest-square** | Pinterest Square
fa5-**place-of-worship** | Place Of Worship
fa5-**plane** | plane
fa5-**plane-arrival** | Plane Arrival
fa5-**plane-departure** | Plane Departure
fa5-**play** | play
fa5-**play-circle** | Play Circle
fa5-**playstation** | PlayStation
fa5-**plug** | Plug
fa5-**plus** | plus
fa5-**plus-circle** | Plus Circle
fa5-**plus-square** | Plus Square
fa5-**podcast** | Podcast
fa5-**poll** | Poll
fa5-**poll-h** | Poll H
fa5-**poo** | Poo
fa5-**poo-storm** | Poo Storm
fa5-**poop** | Poop
fa5-**portrait** | Portrait
fa5-**pound-sign** | Pound Sign
fa5-**power-off** | Power Off
fa5-**pray** | Pray
fa5-**praying-hands** | Praying Hands
fa5-**prescription** | Prescription
fa5-**prescription-bottle** | Prescription Bottle
fa5-**prescription-bottle-alt** | Alternate Prescription Bottle
fa5-**print** | print
fa5-**procedures** | Procedures
fa5-**product-hunt** | Product Hunt
fa5-**project-diagram** | Project Diagram
fa5-**pushed** | Pushed
fa5-**puzzle-piece** | Puzzle Piece
fa5-**python** | Python
fa5-**qq** | QQ
fa5-**qrcode** | qrcode
fa5-**question** | Question
fa5-**question-circle** | Question Circle
fa5-**quidditch** | Quidditch
fa5-**quinscape** | QuinScape
fa5-**quora** | Quora
fa5-**quote-left** | quote-left
fa5-**quote-right** | quote-right
fa5-**quran** | Quran
fa5-**r-project** | R Project
fa5-**rainbow** | Rainbow
fa5-**random** | random
fa5-**ravelry** | Ravelry
fa5-**react** | React
fa5-**reacteurope** | ReactEurope
fa5-**readme** | ReadMe
fa5-**rebel** | Rebel Alliance
fa5-**receipt** | Receipt
fa5-**recycle** | Recycle
fa5-**red-river** | red river
fa5-**reddit** | reddit Logo
fa5-**reddit-alien** | reddit Alien
fa5-**reddit-square** | reddit Square
fa5-**redo** | Redo
fa5-**redo-alt** | Alternate Redo
fa5-**registered** | Registered Trademark
fa5-**renren** | Renren
fa5-**reply** | Reply
fa5-**reply-all** | reply-all
fa5-**replyd** | replyd
fa5-**republican** | Republican
fa5-**researchgate** | Researchgate
fa5-**resolving** | Resolving
fa5-**retweet** | Retweet
fa5-**rev** | Rev.io
fa5-**ribbon** | Ribbon
fa5-**ring** | Ring
fa5-**road** | road
fa5-**robot** | Robot
fa5-**rocket** | rocket
fa5-**rocketchat** | Rocket.Chat
fa5-**rockrms** | Rockrms
fa5-**route** | Route
fa5-**rss** | rss
fa5-**rss-square** | RSS Square
fa5-**ruble-sign** | Ruble Sign
fa5-**ruler** | Ruler
fa5-**ruler-combined** | Ruler Combined
fa5-**ruler-horizontal** | Ruler Horizontal
fa5-**ruler-vertical** | Ruler Vertical
fa5-**running** | Running
fa5-**rupee-sign** | Indian Rupee Sign
fa5-**sad-cry** | Crying Face
fa5-**sad-tear** | Loudly Crying Face
fa5-**safari** | Safari
fa5-**sass** | Sass
fa5-**save** | Save
fa5-**schlix** | SCHLIX
fa5-**school** | School
fa5-**screwdriver** | Screwdriver
fa5-**scribd** | Scribd
fa5-**scroll** | Scroll
fa5-**search** | Search
fa5-**search-dollar** | Search Dollar
fa5-**search-location** | Search Location
fa5-**search-minus** | Search Minus
fa5-**search-plus** | Search Plus
fa5-**searchengin** | Searchengin
fa5-**seedling** | Seedling
fa5-**sellcast** | Sellcast
fa5-**sellsy** | Sellsy
fa5-**server** | Server
fa5-**servicestack** | Servicestack
fa5-**shapes** | Shapes
fa5-**share** | Share
fa5-**share-alt** | Alternate Share
fa5-**share-alt-square** | Alternate Share Square
fa5-**share-square** | Share Square
fa5-**shekel-sign** | Shekel Sign
fa5-**shield-alt** | Alternate Shield
fa5-**ship** | Ship
fa5-**shipping-fast** | Shipping Fast
fa5-**shirtsinbulk** | Shirts in Bulk
fa5-**shoe-prints** | Shoe Prints
fa5-**shopping-bag** | Shopping Bag
fa5-**shopping-basket** | Shopping Basket
fa5-**shopping-cart** | shopping-cart
fa5-**shopware** | Shopware
fa5-**shower** | Shower
fa5-**shuttle-van** | Shuttle Van
fa5-**sign** | Sign
fa5-**sign-in-alt** | Alternate Sign In
fa5-**sign-language** | Sign Language
fa5-**sign-out-alt** | Alternate Sign Out
fa5-**signal** | signal
fa5-**signature** | Signature
fa5-**simplybuilt** | SimplyBuilt
fa5-**sistrix** | SISTRIX
fa5-**sitemap** | Sitemap
fa5-**sith** | Sith
fa5-**skull** | Skull
fa5-**skull-crossbones** | Skull & Crossbones
fa5-**skyatlas** | skyatlas
fa5-**skype** | Skype
fa5-**slack** | Slack Logo
fa5-**slack-hash** | Slack Hashtag
fa5-**slash** | Slash
fa5-**sliders-h** | Horizontal Sliders
fa5-**slideshare** | Slideshare
fa5-**smile** | Smiling Face
fa5-**smile-beam** | Beaming Face With Smiling Eyes
fa5-**smile-wink** | Winking Face
fa5-**smog** | Smog
fa5-**smoking** | Smoking
fa5-**smoking-ban** | Smoking Ban
fa5-**snapchat** | Snapchat
fa5-**snapchat-ghost** | Snapchat Ghost
fa5-**snapchat-square** | Snapchat Square
fa5-**snowflake** | Snowflake
fa5-**socks** | Socks
fa5-**solar-panel** | Solar Panel
fa5-**sort** | Sort
fa5-**sort-alpha-down** | Sort Alpha Down
fa5-**sort-alpha-up** | Sort Alpha Up
fa5-**sort-amount-down** | Sort Amount Down
fa5-**sort-amount-up** | Sort Amount Up
fa5-**sort-down** | Sort Down (Descending)
fa5-**sort-numeric-down** | Sort Numeric Down
fa5-**sort-numeric-up** | Sort Numeric Up
fa5-**sort-up** | Sort Up (Ascending)
fa5-**soundcloud** | SoundCloud
fa5-**spa** | Spa
fa5-**space-shuttle** | Space Shuttle
fa5-**speakap** | Speakap
fa5-**spider** | Spider
fa5-**spinner** | Spinner
fa5-**splotch** | Splotch
fa5-**spotify** | Spotify
fa5-**spray-can** | Spray Can
fa5-**square** | Square
fa5-**square-full** | Square Full
fa5-**square-root-alt** | Square Root Alternate
fa5-**squarespace** | Squarespace
fa5-**stack-exchange** | Stack Exchange
fa5-**stack-overflow** | Stack Overflow
fa5-**stamp** | Stamp
fa5-**star** | Star
fa5-**star-and-crescent** | Star and Crescent
fa5-**star-half** | star-half
fa5-**star-half-alt** | Alternate Star Half
fa5-**star-of-david** | Star of David
fa5-**star-of-life** | Star of Life
fa5-**staylinked** | StayLinked
fa5-**steam** | Steam
fa5-**steam-square** | Steam Square
fa5-**steam-symbol** | Steam Symbol
fa5-**step-backward** | step-backward
fa5-**step-forward** | step-forward
fa5-**stethoscope** | Stethoscope
fa5-**sticker-mule** | Sticker Mule
fa5-**sticky-note** | Sticky Note
fa5-**stop** | stop
fa5-**stop-circle** | Stop Circle
fa5-**stopwatch** | Stopwatch
fa5-**store** | Store
fa5-**store-alt** | Alternate Store
fa5-**strava** | Strava
fa5-**stream** | Stream
fa5-**street-view** | Street View
fa5-**strikethrough** | Strikethrough
fa5-**stripe** | Stripe
fa5-**stripe-s** | Stripe S
fa5-**stroopwafel** | Stroopwafel
fa5-**studiovinari** | Studio Vinari
fa5-**stumbleupon** | StumbleUpon Logo
fa5-**stumbleupon-circle** | StumbleUpon Circle
fa5-**subscript** | subscript
fa5-**subway** | Subway
fa5-**suitcase** | Suitcase
fa5-**suitcase-rolling** | Suitcase Rolling
fa5-**sun** | Sun
fa5-**superpowers** | Superpowers
fa5-**superscript** | superscript
fa5-**supple** | Supple
fa5-**surprise** | Hushed Face
fa5-**swatchbook** | Swatchbook
fa5-**swimmer** | Swimmer
fa5-**swimming-pool** | Swimming Pool
fa5-**synagogue** | Synagogue
fa5-**sync** | Sync
fa5-**sync-alt** | Alternate Sync
fa5-**syringe** | Syringe
fa5-**table** | table
fa5-**table-tennis** | Table Tennis
fa5-**tablet** | tablet
fa5-**tablet-alt** | Alternate Tablet
fa5-**tablets** | Tablets
fa5-**tachometer-alt** | Alternate Tachometer
fa5-**tag** | tag
fa5-**tags** | tags
fa5-**tape** | Tape
fa5-**tasks** | Tasks
fa5-**taxi** | Taxi
fa5-**teamspeak** | TeamSpeak
fa5-**teeth** | Teeth
fa5-**teeth-open** | Teeth Open
fa5-**telegram** | Telegram
fa5-**telegram-plane** | Telegram Plane
fa5-**temperature-high** | High Temperature
fa5-**temperature-low** | Low Temperature
fa5-**tencent-weibo** | Tencent Weibo
fa5-**terminal** | Terminal
fa5-**text-height** | text-height
fa5-**text-width** | text-width
fa5-**th** | th
fa5-**th-large** | th-large
fa5-**th-list** | th-list
fa5-**the-red-yeti** | The Red Yeti
fa5-**theater-masks** | Theater Masks
fa5-**themeco** | Themeco
fa5-**themeisle** | ThemeIsle
fa5-**thermometer** | Thermometer
fa5-**thermometer-empty** | Thermometer Empty
fa5-**thermometer-full** | Thermometer Full
fa5-**thermometer-half** | Thermometer 1/2 Full
fa5-**thermometer-quarter** | Thermometer 1/4 Full
fa5-**thermometer-three-quarters** | Thermometer 3/4 Full
fa5-**think-peaks** | Think Peaks
fa5-**thumbs-down** | thumbs-down
fa5-**thumbs-up** | thumbs-up
fa5-**thumbtack** | Thumbtack
fa5-**ticket-alt** | Alternate Ticket
fa5-**times** | Times
fa5-**times-circle** | Times Circle
fa5-**tint** | tint
fa5-**tint-slash** | Tint Slash
fa5-**tired** | Tired Face
fa5-**toggle-off** | Toggle Off
fa5-**toggle-on** | Toggle On
fa5-**toilet-paper** | Toilet Paper
fa5-**toolbox** | Toolbox
fa5-**tooth** | Tooth
fa5-**torah** | Torah
fa5-**torii-gate** | Torii Gate
fa5-**tractor** | Tractor
fa5-**trade-federation** | Trade Federation
fa5-**trademark** | Trademark
fa5-**traffic-light** | Traffic Light
fa5-**train** | Train
fa5-**transgender** | Transgender
fa5-**transgender-alt** | Alternate Transgender
fa5-**trash** | Trash
fa5-**trash-alt** | Alternate Trash
fa5-**tree** | Tree
fa5-**trello** | Trello
fa5-**tripadvisor** | TripAdvisor
fa5-**trophy** | trophy
fa5-**truck** | truck
fa5-**truck-loading** | Truck Loading
fa5-**truck-monster** | Truck Monster
fa5-**truck-moving** | Truck Moving
fa5-**truck-pickup** | Truck Side
fa5-**tshirt** | T-Shirt
fa5-**tty** | TTY
fa5-**tumblr** | Tumblr
fa5-**tumblr-square** | Tumblr Square
fa5-**tv** | Television
fa5-**twitch** | Twitch
fa5-**twitter** | Twitter
fa5-**twitter-square** | Twitter Square
fa5-**typo3** | Typo3
fa5-**uber** | Uber
fa5-**uikit** | UIkit
fa5-**umbrella** | Umbrella
fa5-**umbrella-beach** | Umbrella Beach
fa5-**underline** | Underline
fa5-**undo** | Undo
fa5-**undo-alt** | Alternate Undo
fa5-**uniregistry** | Uniregistry
fa5-**universal-access** | Universal Access
fa5-**university** | University
fa5-**unlink** | unlink
fa5-**unlock** | unlock
fa5-**unlock-alt** | Alternate Unlock
fa5-**untappd** | Untappd
fa5-**upload** | Upload
fa5-**usb** | USB
fa5-**user** | User
fa5-**user-alt** | Alternate User
fa5-**user-alt-slash** | Alternate User Slash
fa5-**user-astronaut** | User Astronaut
fa5-**user-check** | User Check
fa5-**user-circle** | User Circle
fa5-**user-clock** | User Clock
fa5-**user-cog** | User Cog
fa5-**user-edit** | User Edit
fa5-**user-friends** | User Friends
fa5-**user-graduate** | User Graduate
fa5-**user-injured** | User Injured
fa5-**user-lock** | User Lock
fa5-**user-md** | user-md
fa5-**user-minus** | User Minus
fa5-**user-ninja** | User Ninja
fa5-**user-plus** | User Plus
fa5-**user-secret** | User Secret
fa5-**user-shield** | User Shield
fa5-**user-slash** | User Slash
fa5-**user-tag** | User Tag
fa5-**user-tie** | User Tie
fa5-**user-times** | Remove User
fa5-**users** | Users
fa5-**users-cog** | Users Cog
fa5-**ussunnah** | us-Sunnah Foundation
fa5-**utensil-spoon** | Utensil Spoon
fa5-**utensils** | Utensils
fa5-**vaadin** | Vaadin
fa5-**vector-square** | Vector Square
fa5-**venus** | Venus
fa5-**venus-double** | Venus Double
fa5-**venus-mars** | Venus Mars
fa5-**viacoin** | Viacoin
fa5-**viadeo** | Video
fa5-**viadeo-square** | Video Square
fa5-**vial** | Vial
fa5-**vials** | Vials
fa5-**viber** | Viber
fa5-**video** | Video
fa5-**video-slash** | Video Slash
fa5-**vihara** | Vihara
fa5-**vimeo** | Vimeo
fa5-**vimeo-square** | Vimeo Square
fa5-**vimeo-v** | Vimeo
fa5-**vine** | Vine
fa5-**vk** | VK
fa5-**vnv** | VNV
fa5-**volleyball-ball** | Volleyball Ball
fa5-**volume-down** | Volume Down
fa5-**volume-mute** | Volume Mute
fa5-**volume-off** | Volume Off
fa5-**volume-up** | Volume Up
fa5-**vote-yea** | Vote Yea
fa5-**vr-cardboard** | Cardboard VR
fa5-**vuejs** | Vue.js
fa5-**walking** | Walking
fa5-**wallet** | Wallet
fa5-**warehouse** | Warehouse
fa5-**water** | Water
fa5-**weebly** | Weebly
fa5-**weibo** | Weibo
fa5-**weight** | Weight
fa5-**weight-hanging** | Hanging Weight
fa5-**weixin** | Weixin (WeChat)
fa5-**whatsapp** | What's App
fa5-**whatsapp-square** | What's App Square
fa5-**wheelchair** | Wheelchair
fa5-**whmcs** | WHMCS
fa5-**wifi** | WiFi
fa5-**wikipedia-w** | Wikipedia W
fa5-**wind** | Wind
fa5-**window-close** | Window Close
fa5-**window-maximize** | Window Maximize
fa5-**window-minimize** | Window Minimize
fa5-**window-restore** | Window Restore
fa5-**windows** | Windows
fa5-**wine-bottle** | Wine Bottle
fa5-**wine-glass** | Wine Glass
fa5-**wine-glass-alt** | Alternate Wine Glas
fa5-**wix** | Wix
fa5-**wizards-of-the-coast** | Wizards of the Coast
fa5-**wolf-pack-battalion** | Wolf Pack Battalion
fa5-**won-sign** | Won Sign
fa5-**wordpress** | WordPress Logo
fa5-**wordpress-simple** | Wordpress Simple
fa5-**wpbeginner** | WPBeginner
fa5-**wpexplorer** | WPExplorer
fa5-**wpforms** | WPForms
fa5-**wpressr** | wpressr
fa5-**wrench** | Wrench
fa5-**x-ray** | X-Ray
fa5-**xbox** | Xbox
fa5-**xing** | Xing
fa5-**xing-square** | Xing Square
fa5-**y-combinator** | Y Combinator
fa5-**yahoo** | Yahoo Logo
fa5-**yandex** | Yandex
fa5-**yandex-international** | Yandex International
fa5-**yelp** | Yelp
fa5-**yen-sign** | Yen Sign
fa5-**yin-yang** | Yin Yang
fa5-**yoast** | Yoast
fa5-**youtube** | YouTube
fa5-**youtube-square** | YouTube Square
fa5-**zhihu** | Zhihu
@fa5-**ul** | Unordered list. Apply on ul element
@fa5-**li** | List item. Apply on span element inside li element
@fa5-**border** | Icon with border
@fa5-**pull-right** | Pull icon to right
@fa5-**pull-left** | Pull icon to left
@fa5-**spin** | Animates continuously rotating icon
@fa5-**pulse** | Animates 8 step rotating icon
@fa5-**rotate-90** | Rotates icon by 90 degrees
@fa5-**rotate-180** | Rotates icon by 180 degrees
@fa5-**rotate-270** | Rotates icon by 270 degrees
@fa5-**flip-horizontal** | Flips icon horizontally
@fa5-**flip-vertical** | Flips icon vertically
@fa5-**stack** | Stacks multiple icons. Apply on parent
@fa5-**stack-1x** | Regular sized stacked icon
@fa5-**stack-2x** | Larger sized stacked icon
@fa5-**inverse** | Alternative colored icon


### Font Awesome 5 Pro icon snippets

Trigger | Description
--- | ---
fa5p-**$-js** | Font Awesome 5 Pro js link
fa5p-**$-css** | Font Awesome 5 Pro CSS link
fa5p-**500px** | 500px
fa5p-**abacus** | Abacus
fa5p-**accessible-icon** | Accessible Icon
fa5p-**accusoft** | Accusoft
fa5p-**acorn** | Acorn
fa5p-**acquisitions-incorporated** | Acquisitions Incorporated
fa5p-**ad** | Ad
fa5p-**address-book** | Address Book
fa5p-**address-card** | Address Card
fa5p-**adjust** | adjust
fa5p-**adn** | App.net
fa5p-**adversal** | Adversal
fa5p-**affiliatetheme** | affiliatetheme
fa5p-**air-freshener** | Air Freshener
fa5p-**alarm-clock** | Alarm Clock
fa5p-**algolia** | Algolia
fa5p-**alicorn** | Alicorn
fa5p-**align-center** | align-center
fa5p-**align-justify** | align-justify
fa5p-**align-left** | align-left
fa5p-**align-right** | align-right
fa5p-**alipay** | Alipay
fa5p-**allergies** | Allergies
fa5p-**amazon** | Amazon
fa5p-**amazon-pay** | Amazon Pay
fa5p-**ambulance** | ambulance
fa5p-**american-sign-language-interpreting** | American Sign Language Interpreting
fa5p-**amilia** | Amilia
fa5p-**analytics** | Analytics
fa5p-**anchor** | Anchor
fa5p-**android** | Android
fa5p-**angellist** | AngelList
fa5p-**angle-double-down** | Angle Double Down
fa5p-**angle-double-left** | Angle Double Left
fa5p-**angle-double-right** | Angle Double Right
fa5p-**angle-double-up** | Angle Double Up
fa5p-**angle-down** | angle-down
fa5p-**angle-left** | angle-left
fa5p-**angle-right** | angle-right
fa5p-**angle-up** | angle-up
fa5p-**angry** | Angry Face
fa5p-**angrycreative** | Angry Creative
fa5p-**angular** | Angular
fa5p-**ankh** | Ankh
fa5p-**app-store** | App Store
fa5p-**app-store-ios** | iOS App Store
fa5p-**apper** | Apper Systems AB
fa5p-**apple** | Apple
fa5p-**apple-alt** | Fruit Apple
fa5p-**apple-crate** | Apple Crate
fa5p-**apple-pay** | Apple Pay
fa5p-**archive** | Archive
fa5p-**archway** | Archway
fa5p-**arrow-alt-circle-down** | Alternate Arrow Circle Down
fa5p-**arrow-alt-circle-left** | Alternate Arrow Circle Left
fa5p-**arrow-alt-circle-right** | Alternate Arrow Circle Right
fa5p-**arrow-alt-circle-up** | Alternate Arrow Circle Up
fa5p-**arrow-alt-down** | Alternate Arrow Down
fa5p-**arrow-alt-from-bottom** | Alternate Arrow from Bottom
fa5p-**arrow-alt-from-left** | Alternate Arrow from Left
fa5p-**arrow-alt-from-right** | Alternate Arrow from Right
fa5p-**arrow-alt-from-top** | Alternate Arrow from Top
fa5p-**arrow-alt-left** | Alternate Arrow Left
fa5p-**arrow-alt-right** | Alternate Arrow Right
fa5p-**arrow-alt-square-down** | Alternate Arrow Square Down
fa5p-**arrow-alt-square-left** | Alternate Arrow Square Left
fa5p-**arrow-alt-square-right** | Alternate Arrow Square Right
fa5p-**arrow-alt-square-up** | Alternate Arrow Square Up
fa5p-**arrow-alt-to-bottom** | Alternate Arrow to Bottom
fa5p-**arrow-alt-to-left** | Alternate Arrow to Left
fa5p-**arrow-alt-to-right** | Alternate Arrow to Right
fa5p-**arrow-alt-to-top** | Alternate Arrow to Top
fa5p-**arrow-alt-up** | Alternate Arrow Up
fa5p-**arrow-circle-down** | Arrow Circle Down
fa5p-**arrow-circle-left** | Arrow Circle Left
fa5p-**arrow-circle-right** | Arrow Circle Right
fa5p-**arrow-circle-up** | Arrow Circle Up
fa5p-**arrow-down** | arrow-down
fa5p-**arrow-from-bottom** | Arrow from Bottom
fa5p-**arrow-from-left** | Arrow from Left
fa5p-**arrow-from-right** | Arrow from Right
fa5p-**arrow-from-top** | Arrow from Top
fa5p-**arrow-left** | arrow-left
fa5p-**arrow-right** | arrow-right
fa5p-**arrow-square-down** | Arrow Square Down
fa5p-**arrow-square-left** | Arrow Square Left
fa5p-**arrow-square-right** | Arrow Square Right
fa5p-**arrow-square-up** | Arrow Square Up
fa5p-**arrow-to-bottom** | Arrow to Bottom
fa5p-**arrow-to-left** | Arrow to Left
fa5p-**arrow-to-right** | Arrow to Right
fa5p-**arrow-to-top** | Arrow to Top
fa5p-**arrow-up** | arrow-up
fa5p-**arrows** | Arrows
fa5p-**arrows-alt** | Alternate Arrows
fa5p-**arrows-alt-h** | Alternate Arrows Horizontal
fa5p-**arrows-alt-v** | Alternate Arrows Vertical
fa5p-**arrows-h** | Arrows Horizontal
fa5p-**arrows-v** | Arrows Vertical
fa5p-**assistive-listening-systems** | Assistive Listening Systems
fa5p-**asterisk** | asterisk
fa5p-**asymmetrik** | Asymmetrik, Ltd.
fa5p-**at** | At
fa5p-**atlas** | Atlas
fa5p-**atom** | Atom
fa5p-**atom-alt** | Atom Alt
fa5p-**audible** | Audible
fa5p-**audio-description** | Audio Description
fa5p-**autoprefixer** | Autoprefixer
fa5p-**avianex** | avianex
fa5p-**aviato** | Aviato
fa5p-**award** | Award
fa5p-**aws** | Amazon Web Services (AWS)
fa5p-**axe** | Axe
fa5p-**axe-battle** | Axe Battle
fa5p-**backpack** | Backpack
fa5p-**backspace** | Backspace
fa5p-**backward** | backward
fa5p-**badge** | Badge
fa5p-**badge-check** | Check Badge
fa5p-**badge-dollar** | Badge Dollar
fa5p-**badge-percent** | Badge Percent
fa5p-**badger-honey** | Honey Badger
fa5p-**balance-scale** | Balance Scale
fa5p-**balance-scale-left** | Balance Scale (Left-Weighted)
fa5p-**balance-scale-right** | Balance Scale (Right-Weighted)
fa5p-**ballot** | Ballot
fa5p-**ballot-check** | Ballot Check
fa5p-**ban** | ban
fa5p-**band-aid** | Band-Aid
fa5p-**bandcamp** | Bandcamp
fa5p-**barcode** | barcode
fa5p-**barcode-alt** | Alternate Barcode
fa5p-**barcode-read** | Barcode Read
fa5p-**barcode-scan** | Barcode Scan
fa5p-**bars** | Bars
fa5p-**baseball** | Baseball
fa5p-**baseball-ball** | Baseball Ball
fa5p-**basketball-ball** | Basketball Ball
fa5p-**basketball-hoop** | Basketball Hoop
fa5p-**bat** | Bat
fa5p-**bath** | Bath
fa5p-**battery-bolt** | Battery Bolt
fa5p-**battery-empty** | Battery Empty
fa5p-**battery-full** | Battery Full
fa5p-**battery-half** | Battery 1/2 Full
fa5p-**battery-quarter** | Battery 1/4 Full
fa5p-**battery-slash** | Battery Slash
fa5p-**battery-three-quarters** | Battery 3/4 Full
fa5p-**bed** | Bed
fa5p-**beer** | beer
fa5p-**behance** | Behance
fa5p-**behance-square** | Behance Square
fa5p-**bell** | bell
fa5p-**bell-school** | Bell School
fa5p-**bell-school-slash** | Bell School Slash
fa5p-**bell-slash** | Bell Slash
fa5p-**bezier-curve** | Bezier Curve
fa5p-**bible** | Bible
fa5p-**bicycle** | Bicycle
fa5p-**bimobject** | BIMobject
fa5p-**binoculars** | Binoculars
fa5p-**birthday-cake** | Birthday Cake
fa5p-**bitbucket** | Bitbucket
fa5p-**bitcoin** | Bitcoin
fa5p-**bity** | Bity
fa5p-**black-tie** | Font Awesome Black Tie
fa5p-**blackberry** | BlackBerry
fa5p-**blanket** | Blanket
fa5p-**blender** | Blender
fa5p-**blender-phone** | Blender Phone
fa5p-**blind** | Blind
fa5p-**blogger** | Blogger
fa5p-**blogger-b** | Blogger B
fa5p-**bluetooth** | Bluetooth
fa5p-**bluetooth-b** | Bluetooth
fa5p-**bold** | bold
fa5p-**bolt** | Lightning Bolt
fa5p-**bomb** | Bomb
fa5p-**bone** | Bone
fa5p-**bone-break** | Bone Break
fa5p-**bong** | Bong
fa5p-**book** | book
fa5p-**book-alt** | Alternate Book
fa5p-**book-dead** | Book of the Dead
fa5p-**book-heart** | Book with Heart
fa5p-**book-open** | Book Open
fa5p-**book-reader** | Book Reader
fa5p-**book-spells** | Book of Spells
fa5p-**bookmark** | bookmark
fa5p-**books** | Books
fa5p-**booth-curtain** | Booth with Curtain
fa5p-**bow-arrow** | Bow Arrow
fa5p-**bowling-ball** | Bowling Ball
fa5p-**bowling-pins** | Bowling Pins
fa5p-**box** | Box
fa5p-**box-alt** | Alternate Box
fa5p-**box-ballot** | Box Ballot
fa5p-**box-check** | Box Check
fa5p-**box-fragile** | Box Fragile
fa5p-**box-full** | Box Full
fa5p-**box-heart** | Box with Heart
fa5p-**box-open** | Box Open
fa5p-**box-up** | Box Up
fa5p-**box-usd** | Box with US Dollar
fa5p-**boxes** | Boxes
fa5p-**boxes-alt** | Alternate Boxes
fa5p-**boxing-glove** | Boxing Glove
fa5p-**braille** | Braille
fa5p-**brain** | Brain
fa5p-**briefcase** | Briefcase
fa5p-**briefcase-medical** | Medical Briefcase
fa5p-**broadcast-tower** | Broadcast Tower
fa5p-**broom** | Broom
fa5p-**browser** | Browser
fa5p-**brush** | Brush
fa5p-**btc** | BTC
fa5p-**bug** | Bug
fa5p-**building** | Building
fa5p-**bullhorn** | bullhorn
fa5p-**bullseye** | Bullseye
fa5p-**bullseye-arrow** | Bullseye Arrow
fa5p-**bullseye-pointer** | Bullseye Pointer
fa5p-**burn** | Burn
fa5p-**buromobelexperte** | Büromöbel-Experte GmbH & Co. KG.
fa5p-**bus** | Bus
fa5p-**bus-alt** | Bus Alt
fa5p-**bus-school** | Bus School
fa5p-**business-time** | Business Time
fa5p-**buysellads** | BuySellAds
fa5p-**cabinet-filing** | Filing Cabinet
fa5p-**calculator** | Calculator
fa5p-**calculator-alt** | Alternate Calculator
fa5p-**calendar** | Calendar
fa5p-**calendar-alt** | Alternate Calendar
fa5p-**calendar-check** | Calendar Check
fa5p-**calendar-edit** | Calendar Edit
fa5p-**calendar-exclamation** | Calendar Exclamation
fa5p-**calendar-minus** | Calendar Minus
fa5p-**calendar-plus** | Calendar Plus
fa5p-**calendar-star** | Calendar Star
fa5p-**calendar-times** | Calendar Times
fa5p-**camera** | camera
fa5p-**camera-alt** | Alternate Camera
fa5p-**camera-retro** | Retro Camera
fa5p-**campfire** | Campfire
fa5p-**campground** | Campground
fa5p-**candle-holder** | Candle Holder
fa5p-**candy-corn** | Candy Corn
fa5p-**cannabis** | Cannabis
fa5p-**capsules** | Capsules
fa5p-**car** | Car
fa5p-**car-alt** | Alternate Car
fa5p-**car-battery** | Car Battery
fa5p-**car-bump** | Car Bump
fa5p-**car-crash** | Car Crash
fa5p-**car-garage** | Car Garage
fa5p-**car-mechanic** | Car Mechanic
fa5p-**car-side** | Car Side
fa5p-**car-tilt** | Car Tilt
fa5p-**car-wash** | Car Wash
fa5p-**caret-circle-down** | Caret Circle Down
fa5p-**caret-circle-left** | Caret Circle Left
fa5p-**caret-circle-right** | Caret Circle Right
fa5p-**caret-circle-up** | Caret Circle Up
fa5p-**caret-down** | Caret Down
fa5p-**caret-left** | Caret Left
fa5p-**caret-right** | Caret Right
fa5p-**caret-square-down** | Caret Square Down
fa5p-**caret-square-left** | Caret Square Left
fa5p-**caret-square-right** | Caret Square Right
fa5p-**caret-square-up** | Caret Square Up
fa5p-**caret-up** | Caret Up
fa5p-**cart-arrow-down** | Shopping Cart Arrow Down
fa5p-**cart-plus** | Add to Shopping Cart
fa5p-**cat** | Cat
fa5p-**cauldron** | Cauldron
fa5p-**cc-amazon-pay** | Amazon Pay Credit Card
fa5p-**cc-amex** | American Express Credit Card
fa5p-**cc-apple-pay** | Apple Pay Credit Card
fa5p-**cc-diners-club** | Diner's Club Credit Card
fa5p-**cc-discover** | Discover Credit Card
fa5p-**cc-jcb** | JCB Credit Card
fa5p-**cc-mastercard** | MasterCard Credit Card
fa5p-**cc-paypal** | Paypal Credit Card
fa5p-**cc-stripe** | Stripe Credit Card
fa5p-**cc-visa** | Visa Credit Card
fa5p-**centercode** | Centercode
fa5p-**certificate** | certificate
fa5p-**chair** | Chair
fa5p-**chair-office** | Office Chair
fa5p-**chalkboard** | Chalkboard
fa5p-**chalkboard-teacher** | Chalkboard Teacher
fa5p-**charging-station** | Charging Station
fa5p-**chart-area** | Area Chart
fa5p-**chart-bar** | Bar Chart
fa5p-**chart-line** | Line Chart
fa5p-**chart-line-down** | Line Chart in Down Direction
fa5p-**chart-pie** | Pie Chart
fa5p-**chart-pie-alt** | Alternate Pie Chart
fa5p-**check** | Check
fa5p-**check-circle** | Check Circle
fa5p-**check-double** | Check Double
fa5p-**check-square** | Check Square
fa5p-**chess** | Chess
fa5p-**chess-bishop** | Chess Bishop
fa5p-**chess-bishop-alt** | Alternate Chess Bishop
fa5p-**chess-board** | Chess Board
fa5p-**chess-clock** | Chess Clock
fa5p-**chess-clock-alt** | Alternate Chess Clock
fa5p-**chess-king** | Chess King
fa5p-**chess-king-alt** | Alternate Chess King
fa5p-**chess-knight** | Chess Knight
fa5p-**chess-knight-alt** | Alternate Chess Knight
fa5p-**chess-pawn** | Chess Pawn
fa5p-**chess-pawn-alt** | Alternate Chess Pawn
fa5p-**chess-queen** | Chess Queen
fa5p-**chess-queen-alt** | Alternate Chess Queen
fa5p-**chess-rook** | Chess Rook
fa5p-**chess-rook-alt** | Alternate Chess Rook
fa5p-**chevron-circle-down** | Chevron Circle Down
fa5p-**chevron-circle-left** | Chevron Circle Left
fa5p-**chevron-circle-right** | Chevron Circle Right
fa5p-**chevron-circle-up** | Chevron Circle Up
fa5p-**chevron-double-down** | Chevron Double Down
fa5p-**chevron-double-left** | Chevron Double Left
fa5p-**chevron-double-right** | Chevron Double Right
fa5p-**chevron-double-up** | Chevron Double Up
fa5p-**chevron-down** | chevron-down
fa5p-**chevron-left** | chevron-left
fa5p-**chevron-right** | chevron-right
fa5p-**chevron-square-down** | Chevron Square Down
fa5p-**chevron-square-left** | Chevron Square Left
fa5p-**chevron-square-right** | Chevron Square Right
fa5p-**chevron-square-up** | Chevron Square Up
fa5p-**chevron-up** | chevron-up
fa5p-**child** | Child
fa5p-**chrome** | Chrome
fa5p-**church** | Church
fa5p-**circle** | Circle
fa5p-**circle-notch** | Circle Notched
fa5p-**city** | City
fa5p-**claw-marks** | Claw Marks
fa5p-**clipboard** | Clipboard
fa5p-**clipboard-check** | Clipboard with Check
fa5p-**clipboard-list** | Clipboard List
fa5p-**clipboard-list-check** | Clipboard List with Check
fa5p-**clipboard-prescription** | Clipboard Prescription
fa5p-**clock** | Clock
fa5p-**clone** | Clone
fa5p-**closed-captioning** | Closed Captioning
fa5p-**cloud** | Cloud
fa5p-**cloud-download** | Cloud Download
fa5p-**cloud-download-alt** | Alternate Cloud Download
fa5p-**cloud-drizzle** | Cloud with Drizzle
fa5p-**cloud-hail** | Cloud with Hail
fa5p-**cloud-hail-mixed** | Cloud with Mixed Hail
fa5p-**cloud-meatball** | Cloud with (a chance of) Meatball
fa5p-**cloud-moon** | Cloud with Moon
fa5p-**cloud-moon-rain** | Cloud with Moon and Rain
fa5p-**cloud-rain** | Cloud with Rain
fa5p-**cloud-rainbow** | Cloud with Rainbow
fa5p-**cloud-showers** | Cloud with Showers
fa5p-**cloud-showers-heavy** | Cloud with Heavy Showers
fa5p-**cloud-sleet** | Cloud with Sleet
fa5p-**cloud-snow** | Cloud with Snow
fa5p-**cloud-sun** | Cloud with Sun
fa5p-**cloud-sun-rain** | Cloud with Sun and Rain
fa5p-**cloud-upload** | Cloud Upload
fa5p-**cloud-upload-alt** | Alternate Cloud Upload
fa5p-**clouds** | Clouds
fa5p-**clouds-moon** | Clouds with Moon
fa5p-**clouds-sun** | Clouds with Sun
fa5p-**cloudscale** | cloudscale.ch
fa5p-**cloudsmith** | Cloudsmith
fa5p-**cloudversify** | cloudversify
fa5p-**club** | Club
fa5p-**cocktail** | Cocktail
fa5p-**code** | Code
fa5p-**code-branch** | Code Branch
fa5p-**code-commit** | Code Commit
fa5p-**code-merge** | Code Merge
fa5p-**codepen** | Codepen
fa5p-**codiepie** | Codie Pie
fa5p-**coffee** | Coffee
fa5p-**coffee-togo** | To-Go Coffee
fa5p-**coffin** | Coffin
fa5p-**cog** | cog
fa5p-**cogs** | cogs
fa5p-**coins** | Coins
fa5p-**columns** | Columns
fa5p-**comment** | comment
fa5p-**comment-alt** | Alternate Comment
fa5p-**comment-alt-check** | Alternate Comment Check
fa5p-**comment-alt-dollar** | Comment Alt-dollar
fa5p-**comment-alt-dots** | Alternate Comment Dots
fa5p-**comment-alt-edit** | Alternate Comment Edit
fa5p-**comment-alt-exclamation** | Alternate Comment Exclamation
fa5p-**comment-alt-lines** | Alternate Comment Lines
fa5p-**comment-alt-minus** | Alternate Comment Minus
fa5p-**comment-alt-plus** | Alternate Comment Plus
fa5p-**comment-alt-slash** | Alternate Comment Slash
fa5p-**comment-alt-smile** | Alternate Comment Smile
fa5p-**comment-alt-times** | Alternate Comment Times
fa5p-**comment-check** | Comment Check
fa5p-**comment-dollar** | Comment Dollar
fa5p-**comment-dots** | Comment Dots
fa5p-**comment-edit** | Comment Edit
fa5p-**comment-exclamation** | Comment Exclamation
fa5p-**comment-lines** | Comment Lines
fa5p-**comment-minus** | Comment Minus
fa5p-**comment-plus** | Comment Plus
fa5p-**comment-slash** | Comment Slash
fa5p-**comment-smile** | Comment Smile
fa5p-**comment-times** | Comment Times
fa5p-**comments** | comments
fa5p-**comments-alt** | Alternate Comments
fa5p-**comments-alt-dollar** | Alternate Comments Dollar
fa5p-**comments-dollar** | Comments Dollar
fa5p-**compact-disc** | Compact Disc
fa5p-**compass** | Compass
fa5p-**compass-slash** | Compass Slash
fa5p-**compress** | Compress
fa5p-**compress-alt** | Alternate Compress
fa5p-**compress-wide** | Compress Wide
fa5p-**concierge-bell** | Concierge Bell
fa5p-**connectdevelop** | Connect Develop
fa5p-**container-storage** | Container Storage
fa5p-**contao** | Contao
fa5p-**conveyor-belt** | Conveyor Belt
fa5p-**conveyor-belt-alt** | Alternate Conveyor Belt
fa5p-**cookie** | Cookie
fa5p-**cookie-bite** | Cookie Bite
fa5p-**copy** | Copy
fa5p-**copyright** | Copyright
fa5p-**corn** | Corn
fa5p-**couch** | Couch
fa5p-**cow** | Cow
fa5p-**cpanel** | cPanel
fa5p-**creative-commons** | Creative Commons
fa5p-**creative-commons-by** | Creative Commons Attribution
fa5p-**creative-commons-nc** | Creative Commons Noncommercial
fa5p-**creative-commons-nc-eu** | Creative Commons Noncommercial (Euro Sign)
fa5p-**creative-commons-nc-jp** | Creative Commons Noncommercial (Yen Sign)
fa5p-**creative-commons-nd** | Creative Commons No Derivative Works
fa5p-**creative-commons-pd** | Creative Commons Public Domain
fa5p-**creative-commons-pd-alt** | Creative Commons Public Domain Alternate
fa5p-**creative-commons-remix** | Creative Commons Remix
fa5p-**creative-commons-sa** | Creative Commons Share Alike
fa5p-**creative-commons-sampling** | Creative Commons Sampling
fa5p-**creative-commons-sampling-plus** | Creative Commons Sampling +
fa5p-**creative-commons-share** | Creative Commons Share
fa5p-**creative-commons-zero** | Creative Commons CC0
fa5p-**credit-card** | Credit Card
fa5p-**credit-card-blank** | Credit Card Blank
fa5p-**credit-card-front** | Credit Card Front
fa5p-**cricket** | Cricket
fa5p-**critical-role** | Critical Role
fa5p-**crop** | crop
fa5p-**crop-alt** | Alternate Crop
fa5p-**cross** | Cross
fa5p-**crosshairs** | Crosshairs
fa5p-**crow** | Crow
fa5p-**crown** | Crown
fa5p-**css3** | CSS 3 Logo
fa5p-**css3-alt** | Alternate CSS3 Logo
fa5p-**cube** | Cube
fa5p-**cubes** | Cubes
fa5p-**curling** | Curling
fa5p-**cut** | Cut
fa5p-**cuttlefish** | Cuttlefish
fa5p-**d-and-d** | Dungeons & Dragons
fa5p-**d-and-d-beyond** | D&D Beyond
fa5p-**dagger** | Dagger
fa5p-**dashcube** | DashCube
fa5p-**database** | Database
fa5p-**deaf** | Deaf
fa5p-**delicious** | Delicious Logo
fa5p-**democrat** | Democrat
fa5p-**deploydog** | deploy.dog
fa5p-**deskpro** | Deskpro
fa5p-**desktop** | Desktop
fa5p-**desktop-alt** | Alternate Desktop
fa5p-**dev** | DEV
fa5p-**deviantart** | deviantART
fa5p-**dewpoint** | Dewpoint
fa5p-**dharmachakra** | Dharmachakra
fa5p-**diagnoses** | Diagnoses
fa5p-**diamond** | Diamond
fa5p-**dice** | Dice
fa5p-**dice-d10** | Dice D10
fa5p-**dice-d12** | Dice D12
fa5p-**dice-d20** | Dice D20
fa5p-**dice-d4** | Dice D4
fa5p-**dice-d6** | Dice D6
fa5p-**dice-d8** | Dice D8
fa5p-**dice-five** | Dice Five
fa5p-**dice-four** | Dice Four
fa5p-**dice-one** | Dice One
fa5p-**dice-six** | Dice Six
fa5p-**dice-three** | Dice Three
fa5p-**dice-two** | Dice Two
fa5p-**digg** | Digg Logo
fa5p-**digital-ocean** | Digital Ocean
fa5p-**digital-tachograph** | Digital Tachograph
fa5p-**diploma** | Diploma
fa5p-**directions** | Directions
fa5p-**discord** | Discord
fa5p-**discourse** | Discourse
fa5p-**divide** | Divide
fa5p-**dizzy** | Dizzy Face
fa5p-**dna** | DNA
fa5p-**do-not-enter** | Do Not-enter
fa5p-**dochub** | DocHub
fa5p-**docker** | Docker
fa5p-**dog** | Dog
fa5p-**dog-leashed** | Leashed Dog
fa5p-**dollar-sign** | Dollar Sign
fa5p-**dolly** | Dolly
fa5p-**dolly-empty** | Dolly Empty
fa5p-**dolly-flatbed** | Dolly Flatbed
fa5p-**dolly-flatbed-alt** | Alternate Dolly Flatbed
fa5p-**dolly-flatbed-empty** | Dolly Flatbed-empty
fa5p-**donate** | Donate
fa5p-**door-closed** | Door Closed
fa5p-**door-open** | Door Open
fa5p-**dot-circle** | Dot Circle
fa5p-**dove** | Dove
fa5p-**download** | Download
fa5p-**draft2digital** | Draft2digital
fa5p-**drafting-compass** | Drafting Compass
fa5p-**dragon** | Dragon
fa5p-**draw-circle** | Draw Circle
fa5p-**draw-polygon** | Draw Polygon
fa5p-**draw-square** | Draw Square
fa5p-**dribbble** | Dribbble
fa5p-**dribbble-square** | Dribbble Square
fa5p-**dropbox** | Dropbox
fa5p-**drum** | Drum
fa5p-**drum-steelpan** | Drum Steelpan
fa5p-**drumstick** | Drumstick
fa5p-**drumstick-bite** | Drumstick with Bite Taken Out
fa5p-**drupal** | Drupal Logo
fa5p-**duck** | Duck
fa5p-**dumbbell** | Dumbbell
fa5p-**dungeon** | Dungeon
fa5p-**dyalog** | Dyalog
fa5p-**ear** | Ear
fa5p-**earlybirds** | Earlybirds
fa5p-**ebay** | eBay
fa5p-**eclipse** | Eclipse
fa5p-**eclipse-alt** | Alternate Eclipse
fa5p-**edge** | Edge Browser
fa5p-**edit** | Edit
fa5p-**eject** | eject
fa5p-**elementor** | Elementor
fa5p-**elephant** | Elephant
fa5p-**ellipsis-h** | Horizontal Ellipsis
fa5p-**ellipsis-h-alt** | Alternate Horizontal Ellipsis
fa5p-**ellipsis-v** | Vertical Ellipsis
fa5p-**ellipsis-v-alt** | Alternate Vertical Ellipsis
fa5p-**ello** | Ello
fa5p-**ember** | Ember
fa5p-**empire** | Galactic Empire
fa5p-**empty-set** | Empty Set
fa5p-**engine-warning** | Engine Warning
fa5p-**envelope** | Envelope
fa5p-**envelope-open** | Envelope Open
fa5p-**envelope-open-dollar** | Envelope Open-dollar
fa5p-**envelope-open-text** | Envelope Open-text
fa5p-**envelope-square** | Envelope Square
fa5p-**envira** | Envira Gallery
fa5p-**equals** | Equals
fa5p-**eraser** | eraser
fa5p-**erlang** | Erlang
fa5p-**ethereum** | Ethereum
fa5p-**etsy** | Etsy
fa5p-**euro-sign** | Euro Sign
fa5p-**exchange** | Exchange
fa5p-**exchange-alt** | Alternate Exchange
fa5p-**exclamation** | exclamation
fa5p-**exclamation-circle** | Exclamation Circle
fa5p-**exclamation-square** | Exclamation Square
fa5p-**exclamation-triangle** | Exclamation Triangle
fa5p-**expand** | Expand
fa5p-**expand-alt** | Alternate Expand
fa5p-**expand-arrows** | Expand Arrows
fa5p-**expand-arrows-alt** | Alternate Expand Arrows
fa5p-**expand-wide** | Expand Wide
fa5p-**expeditedssl** | ExpeditedSSL
fa5p-**external-link** | External Link
fa5p-**external-link-alt** | Alternate External Link
fa5p-**external-link-square** | External Link Square
fa5p-**external-link-square-alt** | Alternate External Link Square
fa5p-**eye** | Eye
fa5p-**eye-dropper** | Eye Dropper
fa5p-**eye-evil** | Evil Eye
fa5p-**eye-slash** | Eye Slash
fa5p-**facebook** | Facebook
fa5p-**facebook-f** | Facebook F
fa5p-**facebook-messenger** | Facebook Messenger
fa5p-**facebook-square** | Facebook Square
fa5p-**fantasy-flight-games** | Fantasy Flight-games
fa5p-**fast-backward** | fast-backward
fa5p-**fast-forward** | fast-forward
fa5p-**fax** | Fax
fa5p-**feather** | Feather
fa5p-**feather-alt** | Alternate Feather
fa5p-**female** | Female
fa5p-**field-hockey** | Field Hockey
fa5p-**fighter-jet** | fighter-jet
fa5p-**file** | File
fa5p-**file-alt** | Alternate File
fa5p-**file-archive** | Archive File
fa5p-**file-audio** | Audio File
fa5p-**file-certificate** | File Certificate
fa5p-**file-chart-line** | Chart Line File
fa5p-**file-chart-pie** | Pie Chart File
fa5p-**file-check** | Check File
fa5p-**file-code** | Code File
fa5p-**file-contract** | File Contract
fa5p-**file-csv** | File CSV
fa5p-**file-download** | File Download
fa5p-**file-edit** | Edit File
fa5p-**file-excel** | Excel File
fa5p-**file-exclamation** | Exclamation File
fa5p-**file-export** | File Export
fa5p-**file-image** | Image File
fa5p-**file-import** | File Import
fa5p-**file-invoice** | File Invoice
fa5p-**file-invoice-dollar** | File Invoice with US Dollar
fa5p-**file-medical** | Medical File
fa5p-**file-medical-alt** | Alternate Medical File
fa5p-**file-minus** | Minus File
fa5p-**file-pdf** | PDF File
fa5p-**file-plus** | Plus File
fa5p-**file-powerpoint** | Powerpoint File
fa5p-**file-prescription** | File Prescription
fa5p-**file-signature** | File Signature
fa5p-**file-spreadsheet** | Spreadsheet File
fa5p-**file-times** | Times File
fa5p-**file-upload** | File Upload
fa5p-**file-user** | User File
fa5p-**file-video** | Video File
fa5p-**file-word** | Word File
fa5p-**fill** | Fill
fa5p-**fill-drip** | Fill Drip
fa5p-**film** | Film
fa5p-**film-alt** | Alternate Film
fa5p-**filter** | Filter
fa5p-**fingerprint** | Fingerprint
fa5p-**fire** | fire
fa5p-**fire-extinguisher** | fire-extinguisher
fa5p-**fire-smoke** | Fire and Smoke
fa5p-**firefox** | Firefox
fa5p-**first-aid** | First Aid
fa5p-**first-order** | First Order
fa5p-**first-order-alt** | Alternate First Order
fa5p-**firstdraft** | firstdraft
fa5p-**fish** | Fish
fa5p-**fist-raised** | Raised Fist
fa5p-**flag** | flag
fa5p-**flag-alt** | Alternate Flag
fa5p-**flag-checkered** | flag-checkered
fa5p-**flag-usa** | United States of America Flag
fa5p-**flame** | Flame
fa5p-**flask** | Flask
fa5p-**flask-poison** | Flask Poison
fa5p-**flask-potion** | Flask Potion
fa5p-**flickr** | Flickr
fa5p-**flipboard** | Flipboard
fa5p-**flushed** | Flushed Face
fa5p-**fly** | Fly
fa5p-**fog** | Fog
fa5p-**folder** | Folder
fa5p-**folder-minus** | Folder Minus
fa5p-**folder-open** | Folder Open
fa5p-**folder-plus** | Folder Plus
fa5p-**folder-times** | Folder Times
fa5p-**folders** | Folders
fa5p-**font** | font
fa5p-**font-awesome** | Font Awesome
fa5p-**font-awesome-alt** | Alternate Font Awesome
fa5p-**font-awesome-flag** | Font Awesome Flag
fa5p-**font-awesome-logo-full** | Font Awesome Full Logo
fa5p-**fonticons** | Fonticons
fa5p-**fonticons-fi** | Fonticons Fi
fa5p-**football-ball** | Football Ball
fa5p-**football-helmet** | Football Helmet
fa5p-**forklift** | Forklift
fa5p-**fort-awesome** | Fort Awesome
fa5p-**fort-awesome-alt** | Alternate Fort Awesome
fa5p-**forumbee** | Forumbee
fa5p-**forward** | forward
fa5p-**foursquare** | Foursquare
fa5p-**fragile** | Fragile
fa5p-**free-code-camp** | Free Code Camp
fa5p-**freebsd** | FreeBSD
fa5p-**frog** | Frog
fa5p-**frown** | Frowning Face
fa5p-**frown-open** | Frowning Face With Open Mouth
fa5p-**fulcrum** | Fulcrum
fa5p-**function** | Function
fa5p-**funnel-dollar** | Funnel Dollar
fa5p-**futbol** | Futbol
fa5p-**galactic-republic** | Galactic Republic
fa5p-**galactic-senate** | Galactic Senate
fa5p-**gamepad** | Gamepad
fa5p-**gas-pump** | Gas Pump
fa5p-**gas-pump-slash** | Gas Pump-slash
fa5p-**gavel** | Gavel
fa5p-**gem** | Gem
fa5p-**genderless** | Genderless
fa5p-**get-pocket** | Get Pocket
fa5p-**gg** | GG Currency
fa5p-**gg-circle** | GG Currency Circle
fa5p-**ghost** | Ghost
fa5p-**gift** | gift
fa5p-**gift-card** | Gift Card
fa5p-**git** | Git
fa5p-**git-square** | Git Square
fa5p-**github** | GitHub
fa5p-**github-alt** | Alternate GitHub
fa5p-**github-square** | GitHub Square
fa5p-**gitkraken** | GitKraken
fa5p-**gitlab** | GitLab
fa5p-**gitter** | Gitter
fa5p-**glass-martini** | Martini Glass
fa5p-**glass-martini-alt** | Alternate Glass Martini
fa5p-**glasses** | Glasses
fa5p-**glasses-alt** | Alternate Glasses
fa5p-**glide** | Glide
fa5p-**glide-g** | Glide G
fa5p-**globe** | Globe
fa5p-**globe-africa** | Globe with Africa shown
fa5p-**globe-americas** | Globe with Americas shown
fa5p-**globe-asia** | Globe with Asia shown
fa5p-**globe-stand** | Globe Stand
fa5p-**gofore** | Gofore
fa5p-**golf-ball** | Golf Ball
fa5p-**golf-club** | Golf Club
fa5p-**goodreads** | Goodreads
fa5p-**goodreads-g** | Goodreads G
fa5p-**google** | Google Logo
fa5p-**google-drive** | Google Drive
fa5p-**google-play** | Google Play
fa5p-**google-plus** | Google Plus
fa5p-**google-plus-g** | Google Plus G
fa5p-**google-plus-square** | Google Plus Square
fa5p-**google-wallet** | Google Wallet
fa5p-**gopuram** | Gopuram
fa5p-**graduation-cap** | Graduation Cap
fa5p-**gratipay** | Gratipay (Gittip)
fa5p-**grav** | Grav
fa5p-**greater-than** | Greater Than
fa5p-**greater-than-equal** | Greater Than Equal To
fa5p-**grimace** | Grimacing Face
fa5p-**grin** | Grinning Face
fa5p-**grin-alt** | Alternate Grinning Face
fa5p-**grin-beam** | Grinning Face With Smiling Eyes
fa5p-**grin-beam-sweat** | Grinning Face With Sweat
fa5p-**grin-hearts** | Smiling Face With Heart-Eyes
fa5p-**grin-squint** | Grinning Squinting Face
fa5p-**grin-squint-tears** | Rolling on the Floor Laughing
fa5p-**grin-stars** | Star-Struck
fa5p-**grin-tears** | Face With Tears of Joy
fa5p-**grin-tongue** | Face With Tongue
fa5p-**grin-tongue-squint** | Squinting Face With Tongue
fa5p-**grin-tongue-wink** | Winking Face With Tongue
fa5p-**grin-wink** | Grinning Winking Face
fa5p-**grip-horizontal** | Grip Horizontal
fa5p-**grip-vertical** | Grip Vertical
fa5p-**gripfire** | Gripfire, Inc.
fa5p-**grunt** | Grunt
fa5p-**gulp** | Gulp
fa5p-**h-square** | H Square
fa5p-**h1** | H1 Heading
fa5p-**h2** | H2 Heading
fa5p-**h3** | H3 Heading
fa5p-**hacker-news** | Hacker News
fa5p-**hacker-news-square** | Hacker News Square
fa5p-**hackerrank** | Hackerrank
fa5p-**hammer** | Hammer
fa5p-**hammer-war** | Hammer War
fa5p-**hamsa** | Hamsa
fa5p-**hand-heart** | Hand with Heart
fa5p-**hand-holding** | Hand Holding
fa5p-**hand-holding-box** | Hand Holding Box
fa5p-**hand-holding-heart** | Hand Holding Heart
fa5p-**hand-holding-magic** | Hand Holding-magic
fa5p-**hand-holding-seedling** | Hand Holding Seedling
fa5p-**hand-holding-usd** | Hand Holding US Dollar
fa5p-**hand-holding-water** | Hand Holding Water
fa5p-**hand-lizard** | Lizard (Hand)
fa5p-**hand-paper** | Paper (Hand)
fa5p-**hand-peace** | Peace (Hand)
fa5p-**hand-point-down** | Hand Pointing Down
fa5p-**hand-point-left** | Hand Pointing Left
fa5p-**hand-point-right** | Hand Pointing Right
fa5p-**hand-point-up** | Hand Pointing Up
fa5p-**hand-pointer** | Pointer (Hand)
fa5p-**hand-receiving** | Hand Receiving
fa5p-**hand-rock** | Rock (Hand)
fa5p-**hand-scissors** | Scissors (Hand)
fa5p-**hand-spock** | Spock (Hand)
fa5p-**hands** | Hands
fa5p-**hands-heart** | Hands Heart
fa5p-**hands-helping** | Helping Hands
fa5p-**hands-usd** | Hands with US Dollar
fa5p-**handshake** | Handshake
fa5p-**handshake-alt** | Alternate Handshake
fa5p-**hanukiah** | Hanukiah
fa5p-**hashtag** | Hashtag
fa5p-**hat-witch** | Witch's Hat
fa5p-**hat-wizard** | Wizard's Hat
fa5p-**haykal** | Haykal
fa5p-**hdd** | HDD
fa5p-**head-side** | Head Side
fa5p-**head-vr** | Head VR
fa5p-**heading** | heading
fa5p-**headphones** | headphones
fa5p-**headphones-alt** | Alternate Headphones
fa5p-**headset** | Headset
fa5p-**heart** | Heart
fa5p-**heart-circle** | Heart Circle
fa5p-**heart-rate** | Heart Rate
fa5p-**heart-square** | Heart Square
fa5p-**heartbeat** | Heartbeat
fa5p-**helicopter** | Helicopter
fa5p-**helmet-battle** | Battle Helmet
fa5p-**hexagon** | Hexagon
fa5p-**highlighter** | Highlighter
fa5p-**hiking** | Hiking
fa5p-**hippo** | Hippo
fa5p-**hips** | Hips
fa5p-**hire-a-helper** | HireAHelper
fa5p-**history** | History
fa5p-**hockey-mask** | Hockey Mask
fa5p-**hockey-puck** | Hockey Puck
fa5p-**hockey-sticks** | Hockey Sticks
fa5p-**home** | home
fa5p-**home-heart** | Home Heart
fa5p-**hood-cloak** | Hood Cloak
fa5p-**hooli** | Hooli
fa5p-**hornbill** | Hornbill
fa5p-**horse** | Horse
fa5p-**hospital** | hospital
fa5p-**hospital-alt** | Alternate Hospital
fa5p-**hospital-symbol** | Hospital Symbol
fa5p-**hot-tub** | Hot Tub
fa5p-**hotel** | Hotel
fa5p-**hotjar** | Hotjar
fa5p-**hourglass** | Hourglass
fa5p-**hourglass-end** | Hourglass End
fa5p-**hourglass-half** | Hourglass Half
fa5p-**hourglass-start** | Hourglass Start
fa5p-**house-damage** | Damaged House
fa5p-**house-flood** | Flooded House
fa5p-**houzz** | Houzz
fa5p-**hryvnia** | Hryvnia
fa5p-**html5** | HTML 5 Logo
fa5p-**hubspot** | HubSpot
fa5p-**humidity** | Humidity
fa5p-**hurricane** | Hurricane
fa5p-**i-cursor** | I Beam Cursor
fa5p-**id-badge** | Identification Badge
fa5p-**id-card** | Identification Card
fa5p-**id-card-alt** | Alternate Identification Card
fa5p-**image** | Image
fa5p-**images** | Images
fa5p-**imdb** | IMDB
fa5p-**inbox** | inbox
fa5p-**inbox-in** | Inbox In
fa5p-**inbox-out** | Inbox Out
fa5p-**indent** | Indent
fa5p-**industry** | Industry
fa5p-**industry-alt** | Alternate Industry
fa5p-**infinity** | Infinity
fa5p-**info** | Info
fa5p-**info-circle** | Info Circle
fa5p-**info-square** | Info Square
fa5p-**inhaler** | Inhaler
fa5p-**instagram** | Instagram
fa5p-**integral** | Integral
fa5p-**internet-explorer** | Internet-explorer
fa5p-**intersection** | Intersection
fa5p-**inventory** | Inventory
fa5p-**ioxhost** | ioxhost
fa5p-**italic** | italic
fa5p-**itunes** | iTunes
fa5p-**itunes-note** | Itunes Note
fa5p-**jack-o-lantern** | Jack-o'-lantern
fa5p-**java** | Java
fa5p-**jedi** | Jedi
fa5p-**jedi-order** | Jedi Order
fa5p-**jenkins** | Jenkis
fa5p-**joget** | Joget
fa5p-**joint** | Joint
fa5p-**joomla** | Joomla Logo
fa5p-**journal-whills** | Journal of the Whills
fa5p-**js** | JavaScript (JS)
fa5p-**js-square** | JavaScript (JS) Square
fa5p-**jsfiddle** | jsFiddle
fa5p-**kaaba** | Kaaba
fa5p-**kaggle** | Kaggle
fa5p-**key** | key
fa5p-**key-skeleton** | Key Skeleton
fa5p-**keybase** | Keybase
fa5p-**keyboard** | Keyboard
fa5p-**keycdn** | KeyCDN
fa5p-**keynote** | Keynote
fa5p-**khanda** | Khanda
fa5p-**kickstarter** | Kickstarter
fa5p-**kickstarter-k** | Kickstarter K
fa5p-**kidneys** | Kidneys
fa5p-**kiss** | Kissing Face
fa5p-**kiss-beam** | Kissing Face With Smiling Eyes
fa5p-**kiss-wink-heart** | Face Blowing a Kiss
fa5p-**kite** | Kite
fa5p-**kiwi-bird** | Kiwi Bird
fa5p-**knife-kitchen** | Knife Kitchen
fa5p-**korvue** | KORVUE
fa5p-**lambda** | Lambda
fa5p-**lamp** | Lamp
fa5p-**landmark** | Landmark
fa5p-**landmark-alt** | Alternative Landmark
fa5p-**language** | Language
fa5p-**laptop** | Laptop
fa5p-**laptop-code** | Laptop Code
fa5p-**laravel** | Laravel
fa5p-**lastfm** | last.fm
fa5p-**lastfm-square** | last.fm Square
fa5p-**laugh** | Grinning Face With Big Eyes
fa5p-**laugh-beam** | Laugh Face with Beaming Eyes
fa5p-**laugh-squint** | Laughing Squinting Face
fa5p-**laugh-wink** | Laughing Winking Face
fa5p-**layer-group** | Layer Group
fa5p-**layer-minus** | Layer Minus
fa5p-**layer-plus** | Layer Plus
fa5p-**leaf** | leaf
fa5p-**leaf-heart** | Leaf with a Heart
fa5p-**leaf-maple** | Maple Leaf
fa5p-**leaf-oak** | Oak Leaf
fa5p-**leanpub** | Leanpub
fa5p-**lemon** | Lemon
fa5p-**less** | Less
fa5p-**less-than** | Less Than
fa5p-**less-than-equal** | Less Than Equal To
fa5p-**level-down** | Level Down
fa5p-**level-down-alt** | Alternate Level Down
fa5p-**level-up** | Level Up
fa5p-**level-up-alt** | Alternate Level Up
fa5p-**life-ring** | Life Ring
fa5p-**lightbulb** | Lightbulb
fa5p-**lightbulb-dollar** | Lightbulb Dollar
fa5p-**lightbulb-exclamation** | Lightbulb Exclamation
fa5p-**lightbulb-on** | Lightbulb On
fa5p-**lightbulb-slash** | Lightbulb Slash
fa5p-**line** | Line
fa5p-**link** | Link
fa5p-**linkedin** | LinkedIn
fa5p-**linkedin-in** | LinkedIn In
fa5p-**linode** | Linode
fa5p-**linux** | Linux
fa5p-**lips** | Lips
fa5p-**lira-sign** | Turkish Lira Sign
fa5p-**list** | List
fa5p-**list-alt** | Alternate List
fa5p-**list-ol** | list-ol
fa5p-**list-ul** | list-ul
fa5p-**location** | Location
fa5p-**location-arrow** | location-arrow
fa5p-**location-circle** | Location Circle
fa5p-**location-slash** | Location Slash
fa5p-**lock** | lock
fa5p-**lock-alt** | Alternate Lock
fa5p-**lock-open** | Lock Open
fa5p-**lock-open-alt** | Alternate Lock Open
fa5p-**long-arrow-alt-down** | Alternate Long Arrow Down
fa5p-**long-arrow-alt-left** | Alternate Long Arrow Left
fa5p-**long-arrow-alt-right** | Alternate Long Arrow Right
fa5p-**long-arrow-alt-up** | Alternate Long Arrow Up
fa5p-**long-arrow-down** | Long Arrow Down
fa5p-**long-arrow-left** | Long Arrow Left
fa5p-**long-arrow-right** | Long Arrow Right
fa5p-**long-arrow-up** | Long Arrow Up
fa5p-**loveseat** | Loveseat
fa5p-**low-vision** | Low Vision
fa5p-**luchador** | Luchador
fa5p-**luggage-cart** | Luggage Cart
fa5p-**lungs** | Lungs
fa5p-**lyft** | lyft
fa5p-**mace** | Mace
fa5p-**magento** | Magento
fa5p-**magic** | magic
fa5p-**magnet** | magnet
fa5p-**mail-bulk** | Mail Bulk
fa5p-**mailchimp** | Mailchimp
fa5p-**male** | Male
fa5p-**mandalorian** | Mandalorian
fa5p-**mandolin** | Mandolin
fa5p-**map** | Map
fa5p-**map-marked** | Map Marked
fa5p-**map-marked-alt** | Alternate Map Marked
fa5p-**map-marker** | map-marker
fa5p-**map-marker-alt** | Alternate Map Marker
fa5p-**map-marker-alt-slash** | Alternate Map Marker Slash
fa5p-**map-marker-check** | Map Marker Check
fa5p-**map-marker-edit** | Map Marker Edit
fa5p-**map-marker-exclamation** | Map Marker Exclamation
fa5p-**map-marker-minus** | Map Marker Minus
fa5p-**map-marker-plus** | Map Marker Plus
fa5p-**map-marker-question** | Map Marker Question
fa5p-**map-marker-slash** | Map Marker Slash
fa5p-**map-marker-smile** | Map Marker Smile
fa5p-**map-marker-times** | Map Marker Times
fa5p-**map-pin** | Map Pin
fa5p-**map-signs** | Map Signs
fa5p-**markdown** | Markdown
fa5p-**marker** | Marker
fa5p-**mars** | Mars
fa5p-**mars-double** | Mars Double
fa5p-**mars-stroke** | Mars Stroke
fa5p-**mars-stroke-h** | Mars Stroke Horizontal
fa5p-**mars-stroke-v** | Mars Stroke Vertical
fa5p-**mask** | Mask
fa5p-**mastodon** | Mastodon
fa5p-**maxcdn** | MaxCDN
fa5p-**medal** | Medal
fa5p-**medapps** | MedApps
fa5p-**medium** | Medium
fa5p-**medium-m** | Medium M
fa5p-**medkit** | medkit
fa5p-**medrt** | MRT
fa5p-**meetup** | Meetup
fa5p-**megaphone** | Megaphone
fa5p-**megaport** | Megaport
fa5p-**meh** | Neutral Face
fa5p-**meh-blank** | Face Without Mouth
fa5p-**meh-rolling-eyes** | Face With Rolling Eyes
fa5p-**memory** | Memory
fa5p-**menorah** | Menorah
fa5p-**mercury** | Mercury
fa5p-**meteor** | Meteor
fa5p-**microchip** | Microchip
fa5p-**microphone** | microphone
fa5p-**microphone-alt** | Alternate Microphone
fa5p-**microphone-alt-slash** | Alternate Microphone Slash
fa5p-**microphone-slash** | Microphone Slash
fa5p-**microscope** | Microscope
fa5p-**microsoft** | Microsoft
fa5p-**mind-share** | Mind Share
fa5p-**minus** | minus
fa5p-**minus-circle** | Minus Circle
fa5p-**minus-hexagon** | Minus Hexagon
fa5p-**minus-octagon** | Minus Octagon
fa5p-**minus-square** | Minus Square
fa5p-**mix** | Mix
fa5p-**mixcloud** | Mixcloud
fa5p-**mizuni** | Mizuni
fa5p-**mobile** | Mobile Phone
fa5p-**mobile-alt** | Alternate Mobile
fa5p-**mobile-android** | Mobile Android
fa5p-**mobile-android-alt** | Alternate Mobile Android
fa5p-**modx** | MODX
fa5p-**monero** | Monero
fa5p-**money-bill** | Money Bill
fa5p-**money-bill-alt** | Alternate Money Bill
fa5p-**money-bill-wave** | Wavy Money Bill
fa5p-**money-bill-wave-alt** | Alternate Wavy Money Bill
fa5p-**money-check** | Money Check
fa5p-**money-check-alt** | Alternate Money Check
fa5p-**monitor-heart-rate** | Monitor Heart Rate
fa5p-**monkey** | Monkey
fa5p-**monument** | Monument
fa5p-**moon** | Moon
fa5p-**moon-cloud** | Moon with Cloud
fa5p-**moon-stars** | Moon with Stars
fa5p-**mortar-pestle** | Mortar Pestle
fa5p-**mosque** | Mosque
fa5p-**motorcycle** | Motorcycle
fa5p-**mountain** | Mountain
fa5p-**mountains** | Mountains
fa5p-**mouse-pointer** | Mouse Pointer
fa5p-**music** | Music
fa5p-**napster** | Napster
fa5p-**narwhal** | Narwhal
fa5p-**neos** | Neos
fa5p-**network-wired** | Wired Network
fa5p-**neuter** | Neuter
fa5p-**newspaper** | Newspaper
fa5p-**nimblr** | Nimblr
fa5p-**nintendo-switch** | Nintendo Switch
fa5p-**node** | Node.js
fa5p-**node-js** | Node.js JS
fa5p-**not-equal** | Not Equal
fa5p-**notes-medical** | Medical Notes
fa5p-**npm** | npm
fa5p-**ns8** | NS8
fa5p-**nutritionix** | Nutritionix
fa5p-**object-group** | Object Group
fa5p-**object-ungroup** | Object Ungroup
fa5p-**octagon** | Octagon
fa5p-**odnoklassniki** | Odnoklassniki
fa5p-**odnoklassniki-square** | Odnoklassniki Square
fa5p-**oil-can** | Oil Can
fa5p-**oil-temp** | Oil Temp
fa5p-**old-republic** | Old Republic
fa5p-**om** | Om
fa5p-**omega** | Omega
fa5p-**opencart** | OpenCart
fa5p-**openid** | OpenID
fa5p-**opera** | Opera
fa5p-**optin-monster** | Optin Monster
fa5p-**osi** | Open Source Initiative
fa5p-**otter** | Otter
fa5p-**outdent** | Outdent
fa5p-**page4** | page4 Corporation
fa5p-**pagelines** | Pagelines
fa5p-**paint-brush** | Paint Brush
fa5p-**paint-brush-alt** | Alternate Paint Brush
fa5p-**paint-roller** | Paint Roller
fa5p-**palette** | Palette
fa5p-**palfed** | Palfed
fa5p-**pallet** | Pallet
fa5p-**pallet-alt** | Alternate Pallet
fa5p-**paper-plane** | Paper Plane
fa5p-**paperclip** | Paperclip
fa5p-**parachute-box** | Parachute Box
fa5p-**paragraph** | paragraph
fa5p-**parking** | Parking
fa5p-**parking-circle** | Parking Circle
fa5p-**parking-circle-slash** | Parking Circle-slash
fa5p-**parking-slash** | Parking Slash
fa5p-**passport** | Passport
fa5p-**pastafarianism** | Pastafarianism
fa5p-**paste** | Paste
fa5p-**patreon** | Patreon
fa5p-**pause** | pause
fa5p-**pause-circle** | Pause Circle
fa5p-**paw** | Paw
fa5p-**paw-alt** | Paw Alt
fa5p-**paw-claws** | Paw Claws
fa5p-**paypal** | Paypal
fa5p-**peace** | Peace
fa5p-**pegasus** | Pegasus
fa5p-**pen** | Pen
fa5p-**pen-alt** | Alternate Pen
fa5p-**pen-fancy** | Pen Fancy
fa5p-**pen-nib** | Pen Nib
fa5p-**pen-square** | Pen Square
fa5p-**pencil** | pencil
fa5p-**pencil-alt** | Alternate Pencil
fa5p-**pencil-paintbrush** | Pencil Paintbrush
fa5p-**pencil-ruler** | Pencil Ruler
fa5p-**pennant** | Pennant
fa5p-**penny-arcade** | Penny Arcade
fa5p-**people-carry** | People Carry
fa5p-**percent** | Percent
fa5p-**percentage** | Percentage
fa5p-**periscope** | Periscope
fa5p-**person-booth** | Person Entering Booth
fa5p-**person-carry** | Person Carry
fa5p-**person-dolly** | Person and Dolly
fa5p-**person-dolly-empty** | Person and Empty Dolly
fa5p-**person-sign** | Person Holding Sign
fa5p-**phabricator** | Phabricator
fa5p-**phoenix-framework** | Phoenix Framework
fa5p-**phoenix-squadron** | Phoenix Squadron
fa5p-**phone** | Phone
fa5p-**phone-office** | Office Phone
fa5p-**phone-plus** | Phone Plus
fa5p-**phone-slash** | Phone Slash
fa5p-**phone-square** | Phone Square
fa5p-**phone-volume** | Phone Volume
fa5p-**php** | PHP
fa5p-**pi** | Pi
fa5p-**pie** | Pie
fa5p-**pied-piper** | Pied Piper Logo
fa5p-**pied-piper-alt** | Alternate Pied Piper Logo
fa5p-**pied-piper-hat** | Pied Piper-hat
fa5p-**pied-piper-pp** | Pied Piper PP Logo (Old)
fa5p-**pig** | Pig
fa5p-**piggy-bank** | Piggy Bank
fa5p-**pills** | Pills
fa5p-**pinterest** | Pinterest
fa5p-**pinterest-p** | Pinterest P
fa5p-**pinterest-square** | Pinterest Square
fa5p-**place-of-worship** | Place Of Worship
fa5p-**plane** | plane
fa5p-**plane-alt** | Alternate Plane
fa5p-**plane-arrival** | Plane Arrival
fa5p-**plane-departure** | Plane Departure
fa5p-**play** | play
fa5p-**play-circle** | Play Circle
fa5p-**playstation** | PlayStation
fa5p-**plug** | Plug
fa5p-**plus** | plus
fa5p-**plus-circle** | Plus Circle
fa5p-**plus-hexagon** | Plus Hexagon
fa5p-**plus-octagon** | Plus Octagon
fa5p-**plus-square** | Plus Square
fa5p-**podcast** | Podcast
fa5p-**podium** | Podium
fa5p-**podium-star** | Podium with Star
fa5p-**poll** | Poll
fa5p-**poll-h** | Poll H
fa5p-**poll-people** | Poll People
fa5p-**poo** | Poo
fa5p-**poo-storm** | Poo Storm
fa5p-**poop** | Poop
fa5p-**portrait** | Portrait
fa5p-**pound-sign** | Pound Sign
fa5p-**power-off** | Power Off
fa5p-**pray** | Pray
fa5p-**praying-hands** | Praying Hands
fa5p-**prescription** | Prescription
fa5p-**prescription-bottle** | Prescription Bottle
fa5p-**prescription-bottle-alt** | Alternate Prescription Bottle
fa5p-**presentation** | Presentation
fa5p-**print** | print
fa5p-**print-slash** | Print Slash
fa5p-**procedures** | Procedures
fa5p-**product-hunt** | Product Hunt
fa5p-**project-diagram** | Project Diagram
fa5p-**pumpkin** | Pumpkin
fa5p-**pushed** | Pushed
fa5p-**puzzle-piece** | Puzzle Piece
fa5p-**python** | Python
fa5p-**qq** | QQ
fa5p-**qrcode** | qrcode
fa5p-**question** | Question
fa5p-**question-circle** | Question Circle
fa5p-**question-square** | Question Square
fa5p-**quidditch** | Quidditch
fa5p-**quinscape** | QuinScape
fa5p-**quora** | Quora
fa5p-**quote-left** | quote-left
fa5p-**quote-right** | quote-right
fa5p-**quran** | Quran
fa5p-**r-project** | R Project
fa5p-**rabbit** | Rabbit
fa5p-**rabbit-fast** | Fast Rabbit
fa5p-**racquet** | Racquet
fa5p-**rainbow** | Rainbow
fa5p-**raindrops** | Raindrops
fa5p-**ram** | Ram
fa5p-**ramp-loading** | Ramp Loading
fa5p-**random** | random
fa5p-**ravelry** | Ravelry
fa5p-**react** | React
fa5p-**reacteurope** | ReactEurope
fa5p-**readme** | ReadMe
fa5p-**rebel** | Rebel Alliance
fa5p-**receipt** | Receipt
fa5p-**rectangle-landscape** | Landscape Rectangle
fa5p-**rectangle-portrait** | Portrait Rectangle
fa5p-**rectangle-wide** | Wide Rectangle
fa5p-**recycle** | Recycle
fa5p-**red-river** | red river
fa5p-**reddit** | reddit Logo
fa5p-**reddit-alien** | reddit Alien
fa5p-**reddit-square** | reddit Square
fa5p-**redo** | Redo
fa5p-**redo-alt** | Alternate Redo
fa5p-**registered** | Registered Trademark
fa5p-**renren** | Renren
fa5p-**repeat** | Repeat
fa5p-**repeat-1** | Repeat 1
fa5p-**repeat-1-alt** | Alternate Repeat 1
fa5p-**repeat-alt** | Alternate Repeat
fa5p-**reply** | Reply
fa5p-**reply-all** | reply-all
fa5p-**replyd** | replyd
fa5p-**republican** | Republican
fa5p-**researchgate** | Researchgate
fa5p-**resolving** | Resolving
fa5p-**retweet** | Retweet
fa5p-**retweet-alt** | Alternate Retweet
fa5p-**rev** | Rev.io
fa5p-**ribbon** | Ribbon
fa5p-**ring** | Ring
fa5p-**road** | road
fa5p-**robot** | Robot
fa5p-**rocket** | rocket
fa5p-**rocketchat** | Rocket.Chat
fa5p-**rockrms** | Rockrms
fa5p-**route** | Route
fa5p-**route-highway** | Route Highway
fa5p-**route-interstate** | Route Interstate
fa5p-**rss** | rss
fa5p-**rss-square** | RSS Square
fa5p-**ruble-sign** | Ruble Sign
fa5p-**ruler** | Ruler
fa5p-**ruler-combined** | Ruler Combined
fa5p-**ruler-horizontal** | Ruler Horizontal
fa5p-**ruler-triangle** | Ruler Triangle
fa5p-**ruler-vertical** | Ruler Vertical
fa5p-**running** | Running
fa5p-**rupee-sign** | Indian Rupee Sign
fa5p-**sad-cry** | Crying Face
fa5p-**sad-tear** | Loudly Crying Face
fa5p-**safari** | Safari
fa5p-**sass** | Sass
fa5p-**save** | Save
fa5p-**scalpel** | Scalpel
fa5p-**scalpel-path** | Scalpel Path
fa5p-**scanner** | Scanner
fa5p-**scanner-keyboard** | Scanner Keyboard
fa5p-**scanner-touchscreen** | Scanner Touchscreen
fa5p-**scarecrow** | Scarecrow
fa5p-**schlix** | SCHLIX
fa5p-**school** | School
fa5p-**screwdriver** | Screwdriver
fa5p-**scribd** | Scribd
fa5p-**scroll** | Scroll
fa5p-**scroll-old** | Scroll Old
fa5p-**scrubber** | Scrubber
fa5p-**scythe** | Scythe
fa5p-**search** | Search
fa5p-**search-dollar** | Search Dollar
fa5p-**search-location** | Search Location
fa5p-**search-minus** | Search Minus
fa5p-**search-plus** | Search Plus
fa5p-**searchengin** | Searchengin
fa5p-**seedling** | Seedling
fa5p-**sellcast** | Sellcast
fa5p-**sellsy** | Sellsy
fa5p-**server** | Server
fa5p-**servicestack** | Servicestack
fa5p-**shapes** | Shapes
fa5p-**share** | Share
fa5p-**share-all** | Share All
fa5p-**share-alt** | Alternate Share
fa5p-**share-alt-square** | Alternate Share Square
fa5p-**share-square** | Share Square
fa5p-**sheep** | Sheep
fa5p-**shekel-sign** | Shekel Sign
fa5p-**shield** | shield
fa5p-**shield-alt** | Alternate Shield
fa5p-**shield-check** | shield
fa5p-**shield-cross** | Shield Cross
fa5p-**ship** | Ship
fa5p-**shipping-fast** | Shipping Fast
fa5p-**shipping-timed** | Shipping Timed
fa5p-**shirtsinbulk** | Shirts in Bulk
fa5p-**shoe-prints** | Shoe Prints
fa5p-**shopping-bag** | Shopping Bag
fa5p-**shopping-basket** | Shopping Basket
fa5p-**shopping-cart** | shopping-cart
fa5p-**shopware** | Shopware
fa5p-**shovel** | Shovel
fa5p-**shower** | Shower
fa5p-**shredder** | Shredder
fa5p-**shuttle-van** | Shuttle Van
fa5p-**shuttlecock** | Shuttlecock
fa5p-**sigma** | Sigma (Summation)
fa5p-**sign** | Sign
fa5p-**sign-in** | Sign In
fa5p-**sign-in-alt** | Alternate Sign In
fa5p-**sign-language** | Sign Language
fa5p-**sign-out** | Sign Out
fa5p-**sign-out-alt** | Alternate Sign Out
fa5p-**signal** | signal
fa5p-**signal-1** | Signal 1
fa5p-**signal-2** | Signal 2
fa5p-**signal-3** | Signal 3
fa5p-**signal-4** | Signal 4
fa5p-**signal-alt** | Signal Alternate
fa5p-**signal-alt-1** | Signal Alternate 1
fa5p-**signal-alt-2** | Signal Alternate 2
fa5p-**signal-alt-3** | Signal Alternate 3
fa5p-**signal-alt-slash** | Signal Alternate Slash
fa5p-**signal-slash** | Signal Slash
fa5p-**signature** | Signature
fa5p-**simplybuilt** | SimplyBuilt
fa5p-**sistrix** | SISTRIX
fa5p-**sitemap** | Sitemap
fa5p-**sith** | Sith
fa5p-**skeleton** | Skeleton
fa5p-**skull** | Skull
fa5p-**skull-crossbones** | Skull & Crossbones
fa5p-**skyatlas** | skyatlas
fa5p-**skype** | Skype
fa5p-**slack** | Slack Logo
fa5p-**slack-hash** | Slack Hashtag
fa5p-**slash** | Slash
fa5p-**sliders-h** | Horizontal Sliders
fa5p-**sliders-h-square** | Square Horizontal Sliders
fa5p-**sliders-v** | Vertical Sliders
fa5p-**sliders-v-square** | Square Vertical Sliders
fa5p-**slideshare** | Slideshare
fa5p-**smile** | Smiling Face
fa5p-**smile-beam** | Beaming Face With Smiling Eyes
fa5p-**smile-plus** | Smiling Face Plus
fa5p-**smile-wink** | Winking Face
fa5p-**smog** | Smog
fa5p-**smoke** | Smoke
fa5p-**smoking** | Smoking
fa5p-**smoking-ban** | Smoking Ban
fa5p-**snake** | Snake
fa5p-**snapchat** | Snapchat
fa5p-**snapchat-ghost** | Snapchat Ghost
fa5p-**snapchat-square** | Snapchat Square
fa5p-**snow-blowing** | Snow Blowing
fa5p-**snowflake** | Snowflake
fa5p-**socks** | Socks
fa5p-**solar-panel** | Solar Panel
fa5p-**sort** | Sort
fa5p-**sort-alpha-down** | Sort Alpha Down
fa5p-**sort-alpha-up** | Sort Alpha Up
fa5p-**sort-amount-down** | Sort Amount Down
fa5p-**sort-amount-up** | Sort Amount Up
fa5p-**sort-down** | Sort Down (Descending)
fa5p-**sort-numeric-down** | Sort Numeric Down
fa5p-**sort-numeric-up** | Sort Numeric Up
fa5p-**sort-up** | Sort Up (Ascending)
fa5p-**soundcloud** | SoundCloud
fa5p-**spa** | Spa
fa5p-**space-shuttle** | Space Shuttle
fa5p-**spade** | Spade
fa5p-**speakap** | Speakap
fa5p-**spider** | Spider
fa5p-**spider-black-widow** | Black Widow Spider
fa5p-**spider-web** | Spider Web
fa5p-**spinner** | Spinner
fa5p-**spinner-third** | Spinner Third
fa5p-**splotch** | Splotch
fa5p-**spotify** | Spotify
fa5p-**spray-can** | Spray Can
fa5p-**square** | Square
fa5p-**square-full** | Square Full
fa5p-**square-root** | Square Root
fa5p-**square-root-alt** | Square Root Alternate
fa5p-**squarespace** | Squarespace
fa5p-**squirrel** | Squirrel
fa5p-**stack-exchange** | Stack Exchange
fa5p-**stack-overflow** | Stack Overflow
fa5p-**staff** | Staff
fa5p-**stamp** | Stamp
fa5p-**star** | Star
fa5p-**star-and-crescent** | Star and Crescent
fa5p-**star-exclamation** | Exclamation Star
fa5p-**star-half** | star-half
fa5p-**star-half-alt** | Alternate Star Half
fa5p-**star-of-david** | Star of David
fa5p-**star-of-life** | Star of Life
fa5p-**stars** | Stars
fa5p-**staylinked** | StayLinked
fa5p-**steam** | Steam
fa5p-**steam-square** | Steam Square
fa5p-**steam-symbol** | Steam Symbol
fa5p-**steering-wheel** | Wheel Steering
fa5p-**step-backward** | step-backward
fa5p-**step-forward** | step-forward
fa5p-**stethoscope** | Stethoscope
fa5p-**sticker-mule** | Sticker Mule
fa5p-**sticky-note** | Sticky Note
fa5p-**stomach** | Stomach
fa5p-**stop** | stop
fa5p-**stop-circle** | Stop Circle
fa5p-**stopwatch** | Stopwatch
fa5p-**store** | Store
fa5p-**store-alt** | Alternate Store
fa5p-**strava** | Strava
fa5p-**stream** | Stream
fa5p-**street-view** | Street View
fa5p-**strikethrough** | Strikethrough
fa5p-**stripe** | Stripe
fa5p-**stripe-s** | Stripe S
fa5p-**stroopwafel** | Stroopwafel
fa5p-**studiovinari** | Studio Vinari
fa5p-**stumbleupon** | StumbleUpon Logo
fa5p-**stumbleupon-circle** | StumbleUpon Circle
fa5p-**subscript** | subscript
fa5p-**subway** | Subway
fa5p-**suitcase** | Suitcase
fa5p-**suitcase-rolling** | Suitcase Rolling
fa5p-**sun** | Sun
fa5p-**sun-cloud** | Sun with Cloud
fa5p-**sun-dust** | Sun Dust
fa5p-**sun-haze** | Sun Haze
fa5p-**sunrise** | Sunrise
fa5p-**sunset** | Sunset
fa5p-**superpowers** | Superpowers
fa5p-**superscript** | superscript
fa5p-**supple** | Supple
fa5p-**surprise** | Hushed Face
fa5p-**swatchbook** | Swatchbook
fa5p-**swimmer** | Swimmer
fa5p-**swimming-pool** | Swimming Pool
fa5p-**sword** | Sword
fa5p-**swords** | Swords
fa5p-**synagogue** | Synagogue
fa5p-**sync** | Sync
fa5p-**sync-alt** | Alternate Sync
fa5p-**syringe** | Syringe
fa5p-**table** | table
fa5p-**table-tennis** | Table Tennis
fa5p-**tablet** | tablet
fa5p-**tablet-alt** | Alternate Tablet
fa5p-**tablet-android** | Tablet Android
fa5p-**tablet-android-alt** | Alternate Tablet Android
fa5p-**tablet-rugged** | Rugged Tablet
fa5p-**tablets** | Tablets
fa5p-**tachometer** | Tachometer
fa5p-**tachometer-alt** | Alternate Tachometer
fa5p-**tachometer-alt-average** | Tachometer Alternate Average
fa5p-**tachometer-alt-fast** | Tachometer Alternate Fast
fa5p-**tachometer-alt-fastest** | Tachometer Alternate Fastest
fa5p-**tachometer-alt-slow** | Tachometer Alternate Slow
fa5p-**tachometer-alt-slowest** | Tachometer Alternate Slowest
fa5p-**tachometer-average** | Tachometer Average
fa5p-**tachometer-fast** | Tachometer Fast
fa5p-**tachometer-fastest** | Tachometer Fastest
fa5p-**tachometer-slow** | Tachometer Slow
fa5p-**tachometer-slowest** | Tachometer Slowest
fa5p-**tag** | tag
fa5p-**tags** | tags
fa5p-**tally** | Tally
fa5p-**tape** | Tape
fa5p-**tasks** | Tasks
fa5p-**taxi** | Taxi
fa5p-**teamspeak** | TeamSpeak
fa5p-**teeth** | Teeth
fa5p-**teeth-open** | Teeth Open
fa5p-**telegram** | Telegram
fa5p-**telegram-plane** | Telegram Plane
fa5p-**temperature-frigid** | Temperature Frigid
fa5p-**temperature-high** | High Temperature
fa5p-**temperature-hot** | Temperature Hot
fa5p-**temperature-low** | Low Temperature
fa5p-**tencent-weibo** | Tencent Weibo
fa5p-**tennis-ball** | Tennis Ball
fa5p-**terminal** | Terminal
fa5p-**text-height** | text-height
fa5p-**text-width** | text-width
fa5p-**th** | th
fa5p-**th-large** | th-large
fa5p-**th-list** | th-list
fa5p-**the-red-yeti** | The Red Yeti
fa5p-**theater-masks** | Theater Masks
fa5p-**themeco** | Themeco
fa5p-**themeisle** | ThemeIsle
fa5p-**thermometer** | Thermometer
fa5p-**thermometer-empty** | Thermometer Empty
fa5p-**thermometer-full** | Thermometer Full
fa5p-**thermometer-half** | Thermometer 1/2 Full
fa5p-**thermometer-quarter** | Thermometer 1/4 Full
fa5p-**thermometer-three-quarters** | Thermometer 3/4 Full
fa5p-**theta** | Theta
fa5p-**think-peaks** | Think Peaks
fa5p-**thumbs-down** | thumbs-down
fa5p-**thumbs-up** | thumbs-up
fa5p-**thumbtack** | Thumbtack
fa5p-**thunderstorm** | Thunderstorm
fa5p-**thunderstorm-moon** | Thunderstorm with Moon
fa5p-**thunderstorm-sun** | Thunderstorm with Sun
fa5p-**ticket** | Ticket
fa5p-**ticket-alt** | Alternate Ticket
fa5p-**tilde** | Tilde
fa5p-**times** | Times
fa5p-**times-circle** | Times Circle
fa5p-**times-hexagon** | Times Hexagon
fa5p-**times-octagon** | Times Octagon
fa5p-**times-square** | Times Square
fa5p-**tint** | tint
fa5p-**tint-slash** | Tint Slash
fa5p-**tire** | Tire
fa5p-**tire-flat** | Tire Flat
fa5p-**tire-pressure-warning** | Tire Pressure-warning
fa5p-**tire-rugged** | Tire Rugged
fa5p-**tired** | Tired Face
fa5p-**toggle-off** | Toggle Off
fa5p-**toggle-on** | Toggle On
fa5p-**toilet-paper** | Toilet Paper
fa5p-**toilet-paper-alt** | Alternate Toilet Paper
fa5p-**tombstone** | Tombstone
fa5p-**tombstone-alt** | Alternate Tombstone
fa5p-**toolbox** | Toolbox
fa5p-**tooth** | Tooth
fa5p-**toothbrush** | Toothbrush
fa5p-**torah** | Torah
fa5p-**torii-gate** | Torii Gate
fa5p-**tornado** | Tornado
fa5p-**tractor** | Tractor
fa5p-**trade-federation** | Trade Federation
fa5p-**trademark** | Trademark
fa5p-**traffic-cone** | Traffic Cone
fa5p-**traffic-light** | Traffic Light
fa5p-**traffic-light-go** | Traffic Light-go
fa5p-**traffic-light-slow** | Traffic Light-slow
fa5p-**traffic-light-stop** | Traffic Light-stop
fa5p-**train** | Train
fa5p-**transgender** | Transgender
fa5p-**transgender-alt** | Alternate Transgender
fa5p-**trash** | Trash
fa5p-**trash-alt** | Alternate Trash
fa5p-**treasure-chest** | Treasure Chest
fa5p-**tree** | Tree
fa5p-**tree-alt** | Alternate Tree
fa5p-**trees** | Trees
fa5p-**trello** | Trello
fa5p-**triangle** | Triangle
fa5p-**tripadvisor** | TripAdvisor
fa5p-**trophy** | trophy
fa5p-**trophy-alt** | Alternate Trophy
fa5p-**truck** | truck
fa5p-**truck-container** | Truck Container
fa5p-**truck-couch** | Truck Couch
fa5p-**truck-loading** | Truck Loading
fa5p-**truck-monster** | Truck Monster
fa5p-**truck-moving** | Truck Moving
fa5p-**truck-pickup** | Truck Side
fa5p-**truck-ramp** | Truck Ramp
fa5p-**tshirt** | T-Shirt
fa5p-**tty** | TTY
fa5p-**tumblr** | Tumblr
fa5p-**tumblr-square** | Tumblr Square
fa5p-**turkey** | Turkey
fa5p-**turtle** | Turtle
fa5p-**tv** | Television
fa5p-**tv-retro** | Retro Televison
fa5p-**twitch** | Twitch
fa5p-**twitter** | Twitter
fa5p-**twitter-square** | Twitter Square
fa5p-**typo3** | Typo3
fa5p-**uber** | Uber
fa5p-**uikit** | UIkit
fa5p-**umbrella** | Umbrella
fa5p-**umbrella-beach** | Umbrella Beach
fa5p-**underline** | Underline
fa5p-**undo** | Undo
fa5p-**undo-alt** | Alternate Undo
fa5p-**unicorn** | Unicorn
fa5p-**union** | Union
fa5p-**uniregistry** | Uniregistry
fa5p-**universal-access** | Universal Access
fa5p-**university** | University
fa5p-**unlink** | unlink
fa5p-**unlock** | unlock
fa5p-**unlock-alt** | Alternate Unlock
fa5p-**untappd** | Untappd
fa5p-**upload** | Upload
fa5p-**usb** | USB
fa5p-**usd-circle** | US Dollar Circle
fa5p-**usd-square** | US Dollar Square
fa5p-**user** | User
fa5p-**user-alt** | Alternate User
fa5p-**user-alt-slash** | Alternate User Slash
fa5p-**user-astronaut** | User Astronaut
fa5p-**user-chart** | User Chart
fa5p-**user-check** | User Check
fa5p-**user-circle** | User Circle
fa5p-**user-clock** | User Clock
fa5p-**user-cog** | User Cog
fa5p-**user-crown** | User Crown
fa5p-**user-edit** | User Edit
fa5p-**user-friends** | User Friends
fa5p-**user-graduate** | User Graduate
fa5p-**user-injured** | User Injured
fa5p-**user-lock** | User Lock
fa5p-**user-md** | user-md
fa5p-**user-minus** | User Minus
fa5p-**user-ninja** | User Ninja
fa5p-**user-plus** | User Plus
fa5p-**user-secret** | User Secret
fa5p-**user-shield** | User Shield
fa5p-**user-slash** | User Slash
fa5p-**user-tag** | User Tag
fa5p-**user-tie** | User Tie
fa5p-**user-times** | Remove User
fa5p-**users** | Users
fa5p-**users-class** | Users Class
fa5p-**users-cog** | Users Cog
fa5p-**users-crown** | Users Crown
fa5p-**ussunnah** | us-Sunnah Foundation
fa5p-**utensil-fork** | Utensil Fork
fa5p-**utensil-knife** | Utensil Knife
fa5p-**utensil-spoon** | Utensil Spoon
fa5p-**utensils** | Utensils
fa5p-**utensils-alt** | Alternate Utensils
fa5p-**vaadin** | Vaadin
fa5p-**value-absolute** | Value Absolute
fa5p-**vector-square** | Vector Square
fa5p-**venus** | Venus
fa5p-**venus-double** | Venus Double
fa5p-**venus-mars** | Venus Mars
fa5p-**viacoin** | Viacoin
fa5p-**viadeo** | Video
fa5p-**viadeo-square** | Video Square
fa5p-**vial** | Vial
fa5p-**vials** | Vials
fa5p-**viber** | Viber
fa5p-**video** | Video
fa5p-**video-plus** | Video Plus
fa5p-**video-slash** | Video Slash
fa5p-**vihara** | Vihara
fa5p-**vimeo** | Vimeo
fa5p-**vimeo-square** | Vimeo Square
fa5p-**vimeo-v** | Vimeo
fa5p-**vine** | Vine
fa5p-**vk** | VK
fa5p-**vnv** | VNV
fa5p-**volcano** | Volcano
fa5p-**volleyball-ball** | Volleyball Ball
fa5p-**volume** | Volume
fa5p-**volume-down** | Volume Down
fa5p-**volume-mute** | Volume Mute
fa5p-**volume-off** | Volume Off
fa5p-**volume-slash** | Volume Slash
fa5p-**volume-up** | Volume Up
fa5p-**vote-nay** | Vote Nay
fa5p-**vote-yea** | Vote Yea
fa5p-**vr-cardboard** | Cardboard VR
fa5p-**vuejs** | Vue.js
fa5p-**walking** | Walking
fa5p-**wallet** | Wallet
fa5p-**wand** | Wand
fa5p-**wand-magic** | Wand Magic
fa5p-**warehouse** | Warehouse
fa5p-**warehouse-alt** | Alternate Warehouse
fa5p-**watch** | Watch
fa5p-**watch-fitness** | Watch Fitness
fa5p-**water** | Water
fa5p-**water-lower** | Lower Water Level
fa5p-**water-rise** | Rising Water Level
fa5p-**weebly** | Weebly
fa5p-**weibo** | Weibo
fa5p-**weight** | Weight
fa5p-**weight-hanging** | Hanging Weight
fa5p-**weixin** | Weixin (WeChat)
fa5p-**whale** | Whale
fa5p-**whatsapp** | What's App
fa5p-**whatsapp-square** | What's App Square
fa5p-**wheat** | Wheat
fa5p-**wheelchair** | Wheelchair
fa5p-**whistle** | Whistle
fa5p-**whmcs** | WHMCS
fa5p-**wifi** | WiFi
fa5p-**wifi-1** | Wifi 1
fa5p-**wifi-2** | Wifi 2
fa5p-**wifi-slash** | Wifi Slash
fa5p-**wikipedia-w** | Wikipedia W
fa5p-**wind** | Wind
fa5p-**wind-warning** | Wind Warning
fa5p-**window** | Window
fa5p-**window-alt** | Alternate Window
fa5p-**window-close** | Window Close
fa5p-**window-maximize** | Window Maximize
fa5p-**window-minimize** | Window Minimize
fa5p-**window-restore** | Window Restore
fa5p-**windows** | Windows
fa5p-**windsock** | Windsock
fa5p-**wine-bottle** | Wine Bottle
fa5p-**wine-glass** | Wine Glass
fa5p-**wine-glass-alt** | Alternate Wine Glas
fa5p-**wix** | Wix
fa5p-**wizards-of-the-coast** | Wizards of the Coast
fa5p-**wolf-pack-battalion** | Wolf Pack Battalion
fa5p-**won-sign** | Won Sign
fa5p-**wordpress** | WordPress Logo
fa5p-**wordpress-simple** | Wordpress Simple
fa5p-**wpbeginner** | WPBeginner
fa5p-**wpexplorer** | WPExplorer
fa5p-**wpforms** | WPForms
fa5p-**wpressr** | wpressr
fa5p-**wrench** | Wrench
fa5p-**x-ray** | X-Ray
fa5p-**xbox** | Xbox
fa5p-**xing** | Xing
fa5p-**xing-square** | Xing Square
fa5p-**y-combinator** | Y Combinator
fa5p-**yahoo** | Yahoo Logo
fa5p-**yandex** | Yandex
fa5p-**yandex-international** | Yandex International
fa5p-**yelp** | Yelp
fa5p-**yen-sign** | Yen Sign
fa5p-**yin-yang** | Yin Yang
fa5p-**yoast** | Yoast
fa5p-**youtube** | YouTube
fa5p-**youtube-square** | YouTube Square
fa5p-**zhihu** | Zhihu
@fa5p-**ul** | Unordered list. Apply on ul element
@fa5p-**li** | List item. Apply on span element inside li element
@fa5p-**border** | Icon with border
@fa5p-**pull-right** | Pull icon to right
@fa5p-**pull-left** | Pull icon to left
@fa5p-**spin** | Animates continuously rotating icon
@fa5p-**pulse** | Animates 8 step rotating icon
@fa5p-**rotate-90** | Rotates icon by 90 degrees
@fa5p-**rotate-180** | Rotates icon by 180 degrees
@fa5p-**rotate-270** | Rotates icon by 270 degrees
@fa5p-**flip-horizontal** | Flips icon horizontally
@fa5p-**flip-vertical** | Flips icon vertically
@fa5p-**stack** | Stacks multiple icons. Apply on parent
@fa5p-**stack-1x** | Regular sized stacked icon
@fa5p-**stack-2x** | Larger sized stacked icon
@fa5p-**inverse** | Alternative colored icon


## License

Bootstrap 4, Font Awesome 4, Font Awesome 5 Free & Pro - IntelliJ plugin is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

## Disclaimer

Readme template for this plugin was initially borrowed from [here](https://github.com/bodiam/intellij-bootstrap3) & [here](https://github.com/JasonMortonNZ/bs3-sublime-plugin)
