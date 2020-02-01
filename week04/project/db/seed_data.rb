require_relative( "../models/artists.rb" )
require_relative( "../models/categories.rb" )
require_relative( "../models/artworks.rb" )
require("pry-byebug")

Artist.delete_all()
Category.delete_all()
Artwork.delete_all()


artist1 = Artist.new({
  "first_name" => "Simon",
  "last_name" => "Bisley"
})

artist2 = Artist.new({
  "first_name" => "Chris",
  "last_name" => "Foss"
})

artist3 = Artist.new({
  "first_name" => "Frank",
  "last_name" => "Frazetta"
})

artist4 = Artist.new({
  "first_name" => "Jean",
  "last_name" => "Giraud(Moebius)"
})

artist5 = Artist.new({
  "first_name" => "Jim",
  "last_name" => "Burns"
})

artist1.save()
artist2.save()
artist3.save()
artist4.save()
artist5.save()

category1 = Category.new({
  "type" => "unassigned"
})

category2 = Category.new({
  "type" => "classic"
})

category1.save()
category2.save()


artwork1 = Artwork.new({
  "title" => "painting1",
  "details" => "painting information goes here",
  "date_created" => "10/10/75",
  "artist_id" => 1,
  "category_id" => 1
})

artwork2 = Artwork.new({
  "title" => "painting2",
  "details" => "painting information goes here",
  "date_created" => "10/10/75",
  "artist_id" => 1,
  "category_id" => 1
})

artwork3 = Artwork.new({
  "title" => "painting3",
  "details" => "painting information goes here",
  "date_created" => "10/10/75",
  "artist_id" => 2,
  "category_id" => 1
})

artwork4 = Artwork.new({
  "title" => "painting4",
  "details" => "painting information goes here",
  "date_created" => "30/1/1970",
  "artist_id" => 2,
  "category_id" => 1
})

artwork5 = Artwork.new({
  "title" => "painting5",
  "details" => "painting information goes here",
  "date_created" => "24/6/1985",
  "artist_id" => 3,
  "category_id" => 1
})

artwork6 = Artwork.new({
  "title" => "painting6",
  "details" => "painting information goes here",
  "date_created" => "5/10/2010",
  "artist_id" => 3,
  "category_id" => 1
})

artwork7 = Artwork.new({
  "title" => "painting7",
  "details" => "painting information goes here",
  "date_created" => "13/4/2001",
  "artist_id" => 4,
  "category_id" => 1
})

artwork8 = Artwork.new({
  "title" => "painting8",
  "details" => "painting information goes here",
  "date_created" => "10/1/1990",
  "artist_id" => 4,
  "category_id" => 1
})

artwork9 = Artwork.new({
  "title" => "painting9",
  "details" => "painting information goes here",
  "date_created" => "11/4/1979",
  "artist_id" => 5,
  "category_id" => 1
})

artwork10 = Artwork.new({
  "title" => "painting10",
  "details" => "painting information goes here",
  "date_created" => "1/10/1980",
  "artist_id" => 5,
  "category_id" => 1
})



artwork1.save()
artwork2.save()
artwork3.save()
artwork4.save()
artwork5.save()
artwork6.save()
artwork7.save()
artwork8.save()
artwork9.save()
artwork10.save()
