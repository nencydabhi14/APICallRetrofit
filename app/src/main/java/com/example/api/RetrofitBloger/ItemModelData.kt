package com.example.api.RetrofitBloger

import com.google.gson.annotations.SerializedName

data class ItemModelData(

	@field:SerializedName("kind")
	val kind: String? = null,

	@field:SerializedName("nextPageToken")
	val nextPageToken: String? = null,

	@field:SerializedName("etag")
	val etag: String? = null,

	@field:SerializedName("items")
	val items: List<ItemsItem?>? = null
)

data class Replies(

	@field:SerializedName("totalItems")
	val totalItems: String? = null,

	@field:SerializedName("selfLink")
	val selfLink: String? = null
)

data class ItemsItem(

	@field:SerializedName("replies")
	val replies: Replies? = null,

	@field:SerializedName("kind")
	val kind: String? = null,

	@field:SerializedName("author")
	val author: Author? = null,

	@field:SerializedName("etag")
	val etag: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("published")
	val published: String? = null,

	@field:SerializedName("blog")
	val blog: Blog? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("updated")
	val updated: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("content")
	val content: String? = null,

	@field:SerializedName("selfLink")
	val selfLink: String? = null,

	@field:SerializedName("labels")
	val labels: List<String?>? = null
)

data class Image(

	@field:SerializedName("url")
	val url: String? = null
)

data class Author(

	@field:SerializedName("image")
	val image: Image? = null,

	@field:SerializedName("displayName")
	val displayName: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Blog(

	@field:SerializedName("id")
	val id: String? = null
)
