package io.github.zyrouge.symphony.services.i18n.translations

import io.github.zyrouge.symphony.services.i18n.Translations

class English : Translations {
    override val language = "English"
    override val unk = "?"
    override val songs = "Songs"
    override val artists = "Artists"
    override val albums = "Albums"
    override val settings = "Settings"
    override val details = "Details"
    override val path = "Path"
    override val filename = "Filename"
    override val size = "Size"
    override val dateAdded = "Date Added"
    override val lastModified = "Last Modified"
    override val length = "Length"
    override val bitrate = "Bitrate"
    override val trackName = "Track Name"
    override val artist = "Artist"
    override val album = "Album"
    override val albumArtist = "Album Artist"
    override val composer = "Composer"
    override val nothingIsBeingPlayedRightNow = "Nothing is being played right now"
    override val addToQueue = "Add to queue"
    override val queue = "Queue"
    override val playNext = "Play next"
    override val nowPlaying = "Now Playing"
    override val language_ = "Language"
    override val materialYou = "Material You"
    override val system = "System"
    override val light = "Light"
    override val dark = "Dark"
    override val black = "Black"
    override val viewArtist = "View artist"
    override val title = "Title"
    override val duration = "Duration"
    override val year = "Year"
    override val viewAlbum = "View album"
    override val searchYourMusic = "Search your music"
    override val noResultsFound = "No results found"
    override val albumCount = "Album count"
    override val trackCount = "Track count"
    override val filteringResults = "Filtering results..."
    override val appearance = "Appearance"
    override val about = "About"
    override val github = "Github"
    override val play = "Play"
    override val previous = "Previous"
    override val next = "Next"
    override val pause = "Pause"
    override val done = "Done"
    override val groove = "Groove"
    override val songsFilterPattern = "Songs filter pattern"
    override val reset = "Reset"
    override val theme = "Theme"
    override val checkForUpdates = "Check for updates"
    override val version = "Version"
    override val shufflePlay = "Shuffle play"
    override val viewAlbumArtist = "View album artist"
    override val stop = "Stop"
    override val all = "All"
    override val miniPlayerExtendedControls = "Mini-player extended controls"
    override val fadePlaybackInOut = "Fade playback in-out"
    override val requireAudioFocus = "Require audio focus"
    override val ignoreAudioFocusLoss = "Ignore audio focus loss"
    override val player = "Player"
    override val playOnHeadphonesConnect = "Play on headphones connect"
    override val pauseOnHeadphonesDisconnect = "Pause on headphones disconnect"
    override val genre = "Genre"
    override val damnThisIsSoEmpty = "Damn, this is so empty!"
    override val primaryColor = "Primary Color"
    override val playAll = "Play all"
    override val forYou = "For you"
    override val suggestedAlbums = "Suggested albums"
    override val suggestedArtists = "Suggested artists"
    override val recentlyAddedSongs = "Recently added songs"
    override val sponsorViaGitHub = "Sponsor via GitHub"
    override val clearSongCache = "Clear song cache"
    override val restartAppForChangesToTakeEffect = "Restart app for changes to take effect"
    override val songCacheCleared = "Song cache cleared"
    override val albumArtists = "Album artists"
    override val genres = "Genres"

    override fun playingXofY(x: Int, y: Int) = "Playing $x of $y"
    override fun unknownArtistX(name: String) = "Unknown artist ($name)"
    override fun XSongs(x: Int) = "$x songs"
    override fun unknownAlbumX(id: Long) = "Unknown album (ID: ${id})"
    override fun XArtists(x: Int) = "$x artists"
    override fun XAlbums(x: Int) = "$x albums"
    override fun madeByX(x: String) = "Made by $x"
    override fun newVersionAvailableX(x: String) = "New version available! ($x)"
    override fun XKbps(x: Int) = "${x}kbps"
    override fun XSecs(x: Float) = "${x}s"
    override fun unknownGenreX(x: String) = "Unknown genre $x"
    override fun XGenres(x: Int) = "$x genres"
}
