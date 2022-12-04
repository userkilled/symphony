package io.github.zyrouge.symphony.ui.view.home

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MusicNote
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import io.github.zyrouge.symphony.ui.components.GenreGrid
import io.github.zyrouge.symphony.ui.components.IconTextBody
import io.github.zyrouge.symphony.ui.helpers.ViewContext

@Composable
fun GenresView(context: ViewContext, data: HomeViewData) {
    when {
        data.songs.isNotEmpty() -> GenreGrid(
            context,
            data.genres,
            isLoading = data.songsIsUpdating,
        )
        else -> IconTextBody(
            icon = { modifier ->
                Icon(
                    Icons.Default.MusicNote,
                    null,
                    modifier = modifier,
                )
            },
            content = { Text(context.symphony.t.damnThisIsSoEmpty) }
        )
    }
}
